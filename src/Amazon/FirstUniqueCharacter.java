package Amazon;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {

    public static void main(String[] args) {

        char character = findUniqueCharacter("charlescharles");
        if (!Character.isLetter(character))
        {
            System.out.println("No Unique Character");
        }
        else
        {
            System.out.println(character);
        }
    }

    public static char findUniqueCharacter(String input)
    {
        Map<Character,Integer> map =  new HashMap<>();

        for (char character:input.toCharArray())
        {

            map.put(character, map.getOrDefault(character,0)+1);
        }
        for(char character:input.toCharArray())
        {
            if(map.get(character)==1)
            {
                return character;
            }
        }
        return ' ';

    }
}
