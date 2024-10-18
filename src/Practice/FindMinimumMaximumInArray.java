package Practice;

public class FindMinimumMaximumInArray {
    public static void main(String[] args)
    {
        int[] arr = findMinMax(new int[]{2,6,1,8,4,-1});
        System.out.println("Max: "+arr[0]+ " Min: "+arr[1]);
    }

    public static int[] findMinMax(int[] array)
    {
        int min = array[0],max = array[0];
        for (int j : array) {
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
        }

        return new int[] {max,min};
    }
}
