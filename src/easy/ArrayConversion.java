package easy;

public class ArrayConversion {
    public static void main(String[] args) {

        int[][] result = construct2DArray(new int[] {1,2,3,4},2,2);

        for (int i=0;i<2;i++)
        {
            for (int j=0;j<2;j++)
            {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] construct2DArray(int[] original, int m, int n) {
            int[][] result = new int[m][n];

            if(m<2||n<2)
            {
                return new int[][]{};
            }
            int counter = 0;
        for(int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                result[i][j] = original[counter];
                counter++;
            }
        }

        return result;
    }
}
