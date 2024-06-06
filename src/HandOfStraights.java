import java.util.Map;
import java.util.TreeMap;

public class HandOfStraights {
    //846. Hand of Straights

    /*Alice has some number of cards and she wants to rearrange the cards into groups so that each group is of size groupSize, and consists of groupSize consecutive cards.

Given an integer array hand where hand[i] is the value written on the ith card and an integer groupSize, return true if she can rearrange the cards, or false otherwise.



Example 1:

Input: hand = [1,2,3,6,2,3,4,7,8], groupSize = 3
Output: true
Explanation: Alice's hand can be rearranged as [1,2,3],[2,3,4],[6,7,8]
Example 2:

Input: hand = [1,2,3,4,5], groupSize = 4
Output: false
Explanation: Alice's hand can not be rearranged into groups of 4.*/

    public static void main(String...args)
    {
        boolean result = isNStraightHand(new int[]{1,2,3,6,2,3,4,7,8},3);

        System.out.println(result);
    }

    public static boolean isNStraightHand(int[] hand, int groupSize) {

        //Check if the hand is divisible by the groupSize given

        if (hand.length % groupSize != 0) {
            return false;
        }

        //Add the elements to Map
        Map<Integer, Integer> cardCount = new TreeMap<>();
        for (int card : hand) {
            cardCount.put(card, cardCount.getOrDefault(card, 0) + 1);
        }
//check for grouping is possible with the frequency of cards and subtract the frequency after successfull group formation.
//Return false if group formation by consecutive numbers is not possible
//Return true if all this passes

        for (int card : cardCount.keySet()) {
            int count = cardCount.get(card);
            if (count > 0) {
                for (int i = 0; i < groupSize; ++i) {
                    if (cardCount.getOrDefault(card + i, 0) < count) {
                        return false;
                    }
                    cardCount.put(card + i, cardCount.get(card + i) - count);
                }
            }
        }

        return true;
    }
}
