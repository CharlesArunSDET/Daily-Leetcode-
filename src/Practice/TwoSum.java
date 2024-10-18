package Practice;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args)
    {
            int[] result = findTwoSumBetterTime(new int[]{2,3,5,6,7},11);


        System.out.println(result[0]+"     "+result[1]);
    }

    public static int[] findTwoSum(int[]array,int sum)
    {
        for (int i=0;i<array.length-1;i++)
        {
            if(array[i]+array[i+1]==sum)
            {
                return new int[] {i,i+1};
            }
        }

        return new int[] {};
    }

    public static int[] findTwoSumBetterTime(int[]array,int sum)
    {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<array.length;i++)
        {
            int complement = sum - array[i];

            if(map.containsKey(complement))
            {
                return new int[] {map.get(complement),i};
            }
            map.put(array[i],i);
        }

        return new int[] {};
    }


}
