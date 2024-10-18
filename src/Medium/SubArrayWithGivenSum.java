package Medium;

import java.util.Arrays;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {

        try {
            System.out.println(Arrays.toString(findSubArray(new int[]{1, 4, 3, 5}, 33)));
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static int[] findSubArray(int[] array,int sum)
    {
        int start = 0,currentSum = 0,end;

        for( end = 0;end<array.length;end++)
        {
            currentSum+=array[end];

            while(currentSum>sum&&start<end)
            {
                currentSum-=array[start];
                start++;
            }

            if (currentSum==sum)
            {
                return Arrays.copyOfRange(array,start,end+1);
            }
        }

        throw new IllegalArgumentException("There is no elements with the sum of : "+sum);
    }
}
