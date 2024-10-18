/*
public class MinimumCoins {

*/
/*    Input1: coins[] = {1, 15, 10, 5}, Amount = 30
      Output1: Minimum 3 coins required We can use one coin of Rs.15, one of Rs.10 and one of Rs.5*//*


    public static void main(String []args)
    {

    }

    public static int[] countCoins(int[] coins,int amount)
    {
        int minimum = 3;
        int sum = 0;
        for(int i=0;i<coins.length;i++)
        {
            for(int j=i;j<j+minimum;j++)
            {
                sum+=coins[j];
            }
            if(sum==amount)
            {
                break;
            }
            else
            {
            }
        }
    }
}
*/
