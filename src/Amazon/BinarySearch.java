package Amazon;

public class BinarySearch {

    public static void main(String[] args) {

        System.out.println(findElementByBinarySearch(new int[] { 2,4,5,6,7,8,9},9));

    }

    public static int findElementByBinarySearch(int[] numbers,int numberToFind)
    {
        int left = 0,right=numbers.length-1;
        while(left<=right)
        {
            int mid = left +(right-left)/2;
            if(numberToFind==numbers[mid])
            {
                return mid;
            } else if (numberToFind>numbers[mid]) {
                left = mid+1;
            }
            else
            {
                right = mid-1;
            }
        }
        return -1;
    }
}
