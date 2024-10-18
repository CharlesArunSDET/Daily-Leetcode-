package Practice;

public class BestTimeToBuySellStocks {

    public static void main(String[] args)
    {
        System.out.println(getProfits(new int[] {2,6,4,3,1,7}));
    }

    public static int getProfits(int[] array)
    {
        int profits = 0;

        for(int i=1;i<array.length;i++)
        {

            if(array[i]>array[i-1])
            {
                profits += array[i] - array[i-1];
            }
        }

        return profits;
    }
}
