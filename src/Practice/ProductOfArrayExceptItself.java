package Practice;

public class ProductOfArrayExceptItself {

    public static void main(String[] args)
    {

        int[] arr = findProduct(new int[] {2,3,5,6,1});

        for (int a:arr)
        {
            System.out.println(a);
        }
    }

    public static int[] findProduct(int[] array)
    {

        int n = array.length;

        int[] output = new int[n];

        output[0] = 1;
        for(int i=1;i<n;i++)
        {
            output[i] = output[i-1]*array[i-1];
        }

        int rightProduct = 1;

        for(int i=n-1;i>=0;i--)
        {
            output[i]*=rightProduct;
            rightProduct*=array[i];
        }

        return output;
    }
}
