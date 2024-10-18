package Practice;

public class ReplaceDigits {

    public static void main(String[] args)
    {

    }

    public static String replaceDigits(String word)
    {
        String output = "";
        for(int i=0;i<word.length()-1;i=i+2)
        {
          output = output + word.charAt(i);
        }

        return word;
    }
}
