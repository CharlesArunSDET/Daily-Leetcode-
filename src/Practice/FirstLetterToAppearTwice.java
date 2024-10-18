package Practice;

import java.util.HashMap;
import java.util.Map;

public class FirstLetterToAppearTwice {
    public static void main(String[] args) {

        System.out.println(repeatedCharacter("abccbaacz"));

    }

    public static char repeatedCharacter(String s) {

        for(int i =0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                return s.charAt(i);
            }
        }
        return ' ';
    }
}
