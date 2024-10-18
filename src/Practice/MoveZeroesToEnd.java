package Practice;

public class MoveZeroesToEnd {

    public static void main(String[] args)
    {
        int[] result = moveZeroesToEnd(new int[] {2,3,5,0,4,0,4,0});

        for (int arr:result)
        {
            System.out.println(arr);
        }
    }

    public static int[] moveZeroesToEnd(int[] array)
    {
        int [] result = new int[array.length];
        int count = 0;

        for (int i=0,j=0;i<array.length;i++)
        {
            if(array[i]!=0) {
                result[j] =array[i];
                j++;
            }
            else
            {
                count++;
            }
        }

        for(int i = result.length-1;i<count;i++)
        {
            result[i] = 0;
        }
        return result;
    }
}
