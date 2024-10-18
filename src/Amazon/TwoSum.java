package Amazon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {


        System.out.println(Arrays.toString(findTwoSum(new int[]{2,3,4,5,5,7},7)));
    }

    public static int[] findTwoSum(int[] array,int sum)
    {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<array.length;i++)
        {
            int compliment = sum-array[i];
            if(map.containsKey(compliment))
            {
                return new int[] {map.get(compliment),i};
            }
            map.put(array[i],i);
        }
        return new int[]{};
    }
}
