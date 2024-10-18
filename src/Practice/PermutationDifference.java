package Practice;

import java.util.HashMap;
import java.util.Map;

public class PermutationDifference {

    public static void main(String[] args)
    {
        System.out.println(findPermutationDifference("abc","cba"));
    }

    public static int findPermutationDifference(String s, String t) {

        Map<Character,Integer> firstMap = new HashMap<>();
        Map<Character,Integer> secondMap = new HashMap<>();
        int counter = 0;
        for(char c:s.toCharArray())
        {
            firstMap.put(c,counter);
            counter++;
        }
        counter = 0;
        for(char c:t.toCharArray())
        {
            secondMap.put(c, counter);
            counter++;
        }
        int sum = 0;
        for(Map.Entry<Character,Integer> entry:firstMap.entrySet())
        {
            sum+= Math.abs(entry.getValue() - secondMap.get(entry.getKey()));
        }

        return sum;

    }
}
