package Practice;

public class ReverseArray
{
    public static void main(String[] args)
    {
        int [] array = reverseArray(new int[] {1,3,4,5});
        for (int arr:array)
        {
            System.out.println(arr);
        }
    }

    public static int[] reverseArray(int[] array)
    {
        int left = 0;
        int right = array.length-1;
        while(right>left)
        {
            int temp = array[left];
            array[left]=array[right];
            array[right] = temp;
            left++;
            right--;
        }
        return array;
    }
}
