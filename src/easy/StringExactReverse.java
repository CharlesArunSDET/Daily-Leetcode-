package easy;

public class StringExactReverse {

    public static void main(String[] args) {

        String string = "I am a Software Engineer";
        String wring  = "r ee n ignEeraw tfoSamaI";

        System.out.println(reverseString(string));

    }

    public static String reverseString(String string)
    {

        int left = 0;
        int right = string.length()-1;

        System.out.println(right);

        StringBuilder sb = new StringBuilder(string);

       return sb.reverse().toString();
    }
}
