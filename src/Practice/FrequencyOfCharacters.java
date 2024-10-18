package Practice;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args)
    {
        printFrequencies("");
    }

   /* String str = “Anand”
    result = {A=2, n=2, d=1}*/

    public static void printFrequencies(String string)
    {
        Map<Character,Integer> map = new HashMap<>();

        for(char character:string.toCharArray())
        {
            if(!map.containsKey(Character.toLowerCase(character)) && Character.isUpperCase(character)) {
                map.put(Character.toUpperCase(character), map.getOrDefault(Character.toUpperCase(character), 0) + 1);
            }
            else
            {
                if(map.containsKey(Character.toUpperCase(character)))
                {
                    map.put(Character.toUpperCase(character), map.getOrDefault(Character.toUpperCase(character), 0) + 1);
                }
                else if (map.containsKey(Character.toLowerCase(character)))
                {
                    map.put(Character.toLowerCase(character), map.getOrDefault(Character.toLowerCase(character), 0) + 1);
                } else {
                    map.put(character, map.getOrDefault(character, 0) + 1);
                }
            }
        }


        for(Map.Entry<Character,Integer> entry:map.entrySet())
        {
            System.out.println(entry.getKey() +" = "+entry.getValue());
        }
    }
}
