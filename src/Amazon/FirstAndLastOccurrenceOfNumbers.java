package Amazon;

public class FirstAndLastOccurrenceOfNumbers {

    public static void main(String[] args) {


        int[] array = {1,2,5,5,5,5,5,7,8};

        System.out.println(firstOccurrence(array,5));
        System.out.println(lastOccurrence(array,5));
    }

    public static int firstOccurrence(int[] array,int number)
    {
        int left = 0,right = array.length-1;
        int result=-1;
        while(left<=right)
        {
            int mid = left+(right-left)/2;
            if(number==array[mid])
            {
                result = mid;
                right=mid-1;
            } else if (number>array[mid]) {
                left = mid+1;
            }
            else
            {
                right = mid-1;
            }
        }
        return result;
    }

    public static int lastOccurrence(int[] array,int number)
    {
        int left = 0,right = array.length-1;
        int result=-1;
        while(left<=right)
        {
            int mid = left+(right-left)/2;
            if(number==array[mid])
            {
                result = mid;
                left=mid+1;
            } else if (number>array[mid]) {
                left = mid+1;
            }
            else
            {
                right = mid-1;
            }
        }
        return result;
    }
}
