package easy;

import java.util.HashMap;
import java.util.Map;

public class StringFrequencyConversion {

    public static void main(String[] args) {
        System.out.println(countFrequency("aaabbccdaa"));
    }

    public static String  countFrequency(String value)
    {
       /* Map<Character,Integer> map = new HashMap<>();

        for(char previous:value.toCharArray())
        {
            map.put(previous,map.getOrDefault(previous,0)+1);
        }

        StringBuilder sb = new StringBuilder();

        for (Map.Entry<Character,Integer> entry:map.entrySet())
        {
            sb.append(entry.getKey()).append(entry.getValue());
        }

        return sb.toString();*/
        if(value==null||value.length()<=1)
        {
            return value;
        }

        char previous = value.charAt(0);

        StringBuilder sb = new StringBuilder();

        int count = 1;

        for (int i=1;i<value.length();i++)
        {
            if(previous==value.charAt(i))
            {
                count++;
            }
            else
            {
                sb.append(previous).append(count);
                count=1;
                previous = value.charAt(i);
            }
        }
        sb.append(value.charAt(value.length() - 1)).append(count);
        return sb.toString();
    }
}
