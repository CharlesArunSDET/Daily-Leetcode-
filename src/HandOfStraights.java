import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class HandOfStraights {
    //846. Hand of Straights

    public static void main(String...args)
    {
        boolean result = isNStraightHand(new int[]{1,2,3,6,2,3,4,7,8},3);
    }

    public static boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        }

        Map<Integer, Integer> cardCount = new TreeMap<>();
        for (int card : hand) {
            cardCount.put(card, cardCount.getOrDefault(card, 0) + 1);
        }

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
