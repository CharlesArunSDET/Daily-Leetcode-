package Practice;

public class ReverseString
{
    public static void main(String[] args)
    {
        String string = "Hello World";
        System.out.println(reverseString(string));
    }

    public static String reverseString(String sentence)
    {
        char[] chars = sentence.toCharArray();
        int left = 0, right = chars.length - 1;
        while(left<right)
        {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
       return new String(chars);
    }
}
