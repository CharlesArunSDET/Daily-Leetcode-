package Practice;

import java.util.HashMap;
import java.util.Map;

public class ProgrammingChallenge {

    public static void main(String[] args) {


        String string = "Charles Arun";

        findFrequency(string);
    }

    public static void findFrequency(String value)
    {
        Map<Character,Integer> map = new HashMap<>();

        for(char c:value.toCharArray())
        {
            map.put(Character.toLowerCase(c),map.getOrDefault(Character.toLowerCase(c),0)+1);
        }

        for(Map.Entry<Character,Integer> entry: map.entrySet())
        {
            System.out.println("Character "+entry.getKey() +" is repeated "+ entry.getValue()+" times");
        }
    }

}
