package easy;

public class MoveZeroesToEnd {
    public static void main(String[] args) {

        int[] arr = moveZeroes(new int[] {1,0,0,4,6,7,8,0,9});

        for (int ar:arr)
        {
            System.out.println(ar);
        }
    }

    public static int[] moveZeroes(int[] array)
    {

        int left = 0,right = array.length-1;

        while(left<right)
        {
            if(array[left]==0&&array[right]!=0)
            {
                array[left] = array[right];
                array[right] = 0;
                left++;
                right--;
            }
            else
            {
                if(array[left]!=0)
                {
                    left++;
                }
                if (array[right]==0)
                {
                    right--;
                }
            }
        }

        return array;
    }
}
