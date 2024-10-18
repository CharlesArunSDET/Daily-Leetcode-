package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class RobotReturnToOrigin {
    public static void main(String[] args) {
        System.out.println(judgeCircle("UUDD"));
    }

    public static boolean judgeCircle(String moves) {
      /*  Map<Character,Integer> map = new HashMap<>();

        for(char c:moves.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        return Objects.equals(map.get('U'), map.get('D')) && Objects.equals(map.get('L'), map.get('R'));*/

        if(moves.length()%2==0)
        {
            return false;
        }

        int[] count = new int[91];

        for(char c:moves.toCharArray())
        {
            count[c]++;
        }

        return count['L']==count['R'] && count['U']==count['D'];
    }
}
