package Practice;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrenceOfCharacter {
    public static void main(String []args)
    {
        Map<Character,Integer> map = countCharacter("Karthika");

        System.out.println(map);
    }

    public static Map<Character,Integer> countCharacter(String string)
    {
        Map<Character,Integer> map = new HashMap<>();
        for (Character character:string.toCharArray())
        {
            map.put(character,map.getOrDefault(character,0)+1);
        }
        return map;
    }
}
