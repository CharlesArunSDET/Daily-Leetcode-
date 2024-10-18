package Practice;

import java.util.HashMap;
import java.util.Map;

public class FindTheDuplicateNumber {

    public static void main(String[] args)
    {
        System.out.println(findDuplicate(new int[] {2,3,4,3,2,6,8,7,6,7,6}));
    }

    public static int findDuplicate(int[] array)
    {
        Map<Integer,Integer> map = new HashMap<>();

        for (int arr:array)
        {
            map.put(arr,map.getOrDefault(arr,0)+1);
        }

        int max = Integer.MIN_VALUE;
        int key = Integer.MIN_VALUE;

        for (Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            if(entry.getValue()>max)
            {
                max = entry.getValue();
                key = entry.getKey();
            }
        }

        return key;
    }
}
