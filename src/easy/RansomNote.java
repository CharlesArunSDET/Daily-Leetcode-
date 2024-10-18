package easy;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static void main(String[] args) {

    }

    public static boolean canConstruct(String ransomNote, String magazine)
    {
        Map<Character,Integer> ransomMap = new HashMap<>();
        Map<Character,Integer> magazineMap = new HashMap<>();

        for(char c:ransomNote.toCharArray())
        {
            ransomMap.put(c,ransomMap.getOrDefault(c,0)+1);
        }
        for(char c:magazine.toCharArray())
        {
            magazineMap.put(c,magazineMap.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character,Integer> entry:ransomMap.entrySet())
        {
            if(entry.getValue()>=magazineMap.get(entry.getKey()))
            {
                return false;
            }
        }
        return true;
    }
}
