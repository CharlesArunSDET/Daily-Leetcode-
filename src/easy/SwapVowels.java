package easy;

import java.util.ArrayList;
import java.util.List;

public class SwapVowels {
    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }

    public static String reverseVowels(String s) {
        List<Character> list = new ArrayList<>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');
        list.add('A');
        list.add('E');
        list.add('I');
        list.add('O');
        list.add('U');

        int i=0,j=s.length()-1;
        char[] charArray = s.toCharArray();

        while(i<j)
        {
            if(list.contains(charArray[i])&&list.contains(charArray[j]))
            {
                char temp = charArray[i];
                charArray[i] = s.charAt(j);
               charArray[j] = temp;
                i++;
                j--;
            }
            else if(!list.contains(charArray[i]) &&list.contains(charArray[j]))
            {
                i++;
            } else if (list.contains(charArray[i]) &&!list.contains(charArray[j])) {
                j--;
            }
            else
            {
                i++;
                j--;
            }


        }

        StringBuilder output = new StringBuilder();

        for(char c: charArray)
        {
            output.append(c);
        }

        return output.toString();
    }
}
