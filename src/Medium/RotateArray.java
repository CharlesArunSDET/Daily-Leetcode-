package Medium;

public class RotateArray {
    public static void main(String[] args) {
        rotate(new int[] {1,2,3,4,5,6,7},3);
    }

    public static void rotate(int[] nums, int k) {

        int[] result = new int[nums.length];
        int counter = 0;
        for(int i= nums.length-k;i<nums.length;i++)
        {
           result[counter] = nums[i];
           counter++;
        }

        for (int i=0;i<nums.length-k;i++)
        {
           result[counter] = nums[i];
           counter++;
        }

        int j=0;

        for (int arr:result)
        {
            nums[j] = arr;
            j++;
        }
    }
}
