package Practice;

import java.util.HashMap;
import java.util.Map;

public class CheckAnagram {

    public static void main(String[] args) {

        System.out.println(checkAnagram("test","sett"));

    }

    public static  boolean checkAnagram(String value1,String value2)
    {

        Map<Character,Integer> map = new HashMap<>();

        Map<Character,Integer> map2 = new HashMap<>();

        for(char c:value1.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(char c:value2.toCharArray())
        {
            map2.put(c,map2.getOrDefault(c,0)+1);
        }


        for(Map.Entry<Character,Integer> entry:map.entrySet())
        {
            if(!map2.get(entry.getKey()).equals(entry.getValue()))
            {
                return false;
            }
        }
        return true;
    }
}
