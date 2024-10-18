package easy;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(checkPalindrome("Abc?/Ba"));
    }

    public static boolean checkPalindrome(String string)
    {

      string =   string.replaceAll("\\s","").replaceAll("[^a-z A-Z]","").toUpperCase();


      for(int i=0,j=string.length()-1;i<=j;i++,j--)
      {
          if(string.charAt(i)!=string.charAt(j))
          {
              return false;
          }

      }

        return true;

    }
}
