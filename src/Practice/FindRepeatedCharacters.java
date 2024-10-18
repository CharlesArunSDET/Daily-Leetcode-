package Practice;

import java.util.HashMap;
import java.util.Map;

public class FindRepeatedCharacters {

    public static void main(String[] args)
    {
        printRepeatedCharacter("This is the second Line");
    }

    public static void printRepeatedCharacter(String string)
    {
        Map<Character,Integer> map = new HashMap<>();

        for(char arr: string.toCharArray())
        {
            if(arr!=' ') {
                map.put(Character.toLowerCase(arr), map.getOrDefault(Character.toLowerCase(arr), 0) + 1);
            }
        }

        for(Map.Entry<Character,Integer> entry: map.entrySet())
        {
            if(entry.getValue()>1)
            {
                System.out.println(entry.getKey() + " is repeated: "+ entry.getValue());
            }
        }
    }
}
