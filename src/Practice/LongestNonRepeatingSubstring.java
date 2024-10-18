package Practice;

import java.util.ArrayList;
import java.util.List;

public class LongestNonRepeatingSubstring {

    public static void main(String[] args)
    {
        System.out.println(getLongestNonRepeatingSubstring("abcabcbb"));
    }

    public static int getLongestNonRepeatingSubstring(String string)
    {

        List<Character> list = new ArrayList<>();
        int max = 0,counter=0;

        for (char c:string.toCharArray())
        {
            if(!list.contains(Character.toUpperCase(c)))
            {
                list.add(Character.toUpperCase(c));
                counter++;
            }
            else
            {
                if(counter>max)
                {
                    max= counter;
                }
                counter=0;
                list.clear();
            }
        }

        return max;
    }
}
