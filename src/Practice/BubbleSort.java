package Practice;

public class BubbleSort {
    public static void main(String[] args) {
       int[] arr = bubbleSort(new int[] {2,4,8,6,1,3,5});
       for (int number:arr)
       {
            System.out.println(number);
       }
    }

    public static int[] bubbleSort(int[] arr) {
        for (int i=0;i<arr.length-1;i++)
        {
            boolean swapped = false;
            for (int j=0;j< arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
            {
                break;
            }
        }
        return arr;
    }
}
