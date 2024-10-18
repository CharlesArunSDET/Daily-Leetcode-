package Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class JavaBasics {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(reverseArray(new Integer[]{2, 4, 3, 7, 4})));

        System.out.println(checkArraySorted(new int[] {2,4,5,6}));

        System.out.println(Arrays.toString(removeDuplicateFromArray(new int[]{2,3,3,4,5,6})));


        String input = "1,2,3,5,6,7,89,0";

        String[] inputArray = input.split(",");

        System.out.println(Arrays.toString(inputArray));

        int sum = 0;
        for(String str:inputArray)
        {
            sum+=Integer.parseInt(str);
        }

        System.out.println(sum);

    }

    public static Integer[] reverseArray(Integer[] array)
    {
        Arrays.sort(array,Collections.reverseOrder());

        return array;
    }

    public static boolean checkArraySorted(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                return false;
            }
        }

        return true;
    }

    public static Integer[] removeDuplicateFromArray(int[] array)
    {
        Set<Integer> set = new HashSet<>();

        for (int number:array)
        {
            set.add(number);
        }

        return set.toArray(new Integer[0]);

    }
}
