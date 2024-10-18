package Practice;

public class MissingNumberInArray {
    public static void main(String[] args)
    {
        System.out.println(findMissingNumberInArray(new int[] {0, 1, 2, 4, 5}));
    }

    public static int findMissingNumberInArray(int[] array)
    {
        int size = array.length;
        int total = (size*(size+1))/2;

        int sum = 0;

        for (int arr:array)
        {
           sum+=arr;
        }

        return total-sum;
    }
}
