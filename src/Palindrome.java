public class Palindrome {

    public static void main(String[] args) {


        System.out.println(isPalindrome(10));

    }

    public static boolean isPalindrome(int x)
    {
        if(x<0)
        {
            return false;
        }

        StringBuilder sb = new StringBuilder(String.valueOf(x));

       return Integer.parseInt(sb.reverse().toString()) == x;

    }
}
