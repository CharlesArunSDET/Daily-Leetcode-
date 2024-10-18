package Practice;

public class ReversePrefixOfWord {

    public static void main(String[] args)
    {
        System.out.println(reversePrefix("abcdefg",'d'));
    }

    public static String reversePrefix(String word, char ch) {

         int index = word.indexOf(ch);
         if(index!=-1)
         {
             return new StringBuilder(word.substring(0,index+1)).reverse()+word.substring(index+1);
         }

         return word;
    }
}
