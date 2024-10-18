package Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MaximumStringPairs {

    public static void main(String[] args)
    {
        int m=    maximumNumberOfStringPairs(new String[] {"cd","ac","dc","ca","zz"});

        System.out.println(m);
    }

    public  static int maximumNumberOfStringPairs(String[] words) {

        int counter =0;

        Set<String> set = new HashSet<>();

        for (int i=0;i< words.length;i++)
        {
          String reverse = reverseWord(words[i]);

          if(set.contains(reverse))
          {
              counter++;
              set.remove(words[i]);
          }
          else
          {
              set.add(words[i]);
          }
        }

        return counter;
    }


    public static String reverseWord(String word)
    {
        return new StringBuilder(word).reverse().toString();
    }
}
