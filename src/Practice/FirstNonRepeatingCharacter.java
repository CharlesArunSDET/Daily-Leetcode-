package Practice;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter
{
    public static void main(String[] args)
    {
       Character ch = findFirstNonRepeatingCharacter("kk");
       if(ch!=null)
       {
           System.out.println(ch);
       }
       else
       {
           System.out.println("-1");
       }
    }

    public static Character findFirstNonRepeatingCharacter(String string)
    {
        Map<Character,Integer> map = new HashMap<>();
        for(char c:string.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for (char c:string.toCharArray())
        {
            if(map.get(c).equals(1))
            {
                return c;
            }
        }
        return null;
    }


}
