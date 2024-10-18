package Practice;

import java.util.Arrays;

public class SquareOfArrayInNonDecreasing {
    public static void main(String []args)
    {
        int[] array =squareArrayInNonDecreasing(new int[] {-8, -3, 1, 3, 7});

        for (int arr:array)
        {
            System.out.println(arr);
        }
    }

    public static int[] squareArrayInNonDecreasing(int[] array)
    {
        int result[] = new int[array.length];
        int i=0;
        for (int arr:array)
        {
           result[i++] = arr*arr;
        }
         Arrays.sort(result);
        return result;
    }
}
