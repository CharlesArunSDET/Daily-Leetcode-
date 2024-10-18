package Medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestNonRepeating {
    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {

        Map<Character , Integer> charIndexMap = new HashMap<>();

        int maxLength = 0;
        int start = 0;


        for(int end=0;end<s.length();end++)
        {
            char current = s.charAt(end);

            if(charIndexMap.containsKey(current) && charIndexMap.get(current)>=start )
            {
                start = charIndexMap.get(current)+1;


            }


            charIndexMap.put(current , end);

            maxLength = Math.max(maxLength , end-start+1);

        }

        return maxLength;
    }
}
