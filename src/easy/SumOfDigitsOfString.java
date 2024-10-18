package easy;

public class SumOfDigitsOfString {

    public static void main(String[] args) {
        getLucky("iiii",1);
    }

    public static int getLucky(String s, int k) {

        int sum = 0;

        for(char c:s.toCharArray())
        {
            sum += c-'a'+1;
        }

        if(k<2||sum<10)
        {
            return sum;
        }
        k--;
        int number = sum;
        while(k>1&& number>10)
        {

            int value=0;
            while(number>0)
            {
                 value =+number/10;
                 number%=10;            }
        }
        return sum;

    }
}
