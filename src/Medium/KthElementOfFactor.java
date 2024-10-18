package Medium;

public class KthElementOfFactor {
    public static void main(String[] args) {

        System.out.println(kthFactor(7,2));
    }

    public static int kthFactor(int n, int k) {

if(n<k)
{
    return -1;
}
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                k--;
            }
            if(k==0)
            {
                return i;
            }
        }

        return k-1==0?n:-1;
    }

}
