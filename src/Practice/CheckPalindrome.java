package Practice;

public class CheckPalindrome {

   /* A palindrome is a word which reads the same backward as forward (for example racecar or radar).  Implement the following function: 	bool isPalindrome(string word)
*/
   public static void main(String[] args) {

       System.out.println(checkIfPalindrome("radare"));

   }

   public static Boolean checkIfPalindrome(String string)
   {
       StringBuilder sb = new StringBuilder(string);

       return sb.reverse().toString().equals(string);

   }
}
