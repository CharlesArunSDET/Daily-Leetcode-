package Practice;

import java.util.Stack;

public class MaximumNestingDepth
{
  public static void main(String[] args)
  {
      System.out.println(maxDepth("(1+(2*3)+((8)/4))+1"));
  }

    public static int maxDepth(String s) {

        int openingCounter = 0;
        int max = 0;

        for (char c : s.toCharArray())
        {
            if(c=='(')
            {
                openingCounter++;
            }
            max=  Math.max(max,openingCounter);
            if(c==')')
            {
                openingCounter--;
            }
        }
return max;
    }
}
