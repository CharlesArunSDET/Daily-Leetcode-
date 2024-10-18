package Practice;

public class FindTheSecondLargestNumber
{
    public static void main(String ...args)
    {
        System.out.println(findSecondLargest(new int[] {3,4,1,7,5,9,7}));
    }

    public static int findSecondLargest(int[] array)
    {
        int largest = Integer.MIN_VALUE,secondLargest = Integer.MIN_VALUE;
        for (int arr:array)
        {
            if(arr>largest)
            {
                secondLargest =largest ;
                largest = arr;
            }
            else if(arr>secondLargest && arr!=largest)
            {
                secondLargest = arr;
            }

        }

        return secondLargest;
    }
}
