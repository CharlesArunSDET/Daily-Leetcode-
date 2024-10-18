package Medium;

public class Triplets {
    public static void main(String[] args) {

        System.out.println(increasingTriplet(new int[] {20,100,10,12,5,13}));
    }

    public static boolean increasingTriplet(int[] nums)
    {
        if(nums.length<3)
        {
            return false;
        }
        int first = Integer.MAX_VALUE,second = Integer.MAX_VALUE;
        for (int third : nums) {
            if (third <= first) {
                first = third;
            } else if (third <= second) {
                second = third;
            } else {
                return true;
            }
        }
        return false;
    }
}
