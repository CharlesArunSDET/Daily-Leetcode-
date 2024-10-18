package Practice;

public class SortingTheSentence {
    public static void main(String[] args)
    {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }

    public static String sortSentence(String s) {

       String[] words =  s.split(" ");
       String[] results = new String[words.length];
StringBuilder sb = new StringBuilder();
        int i=0;
       for (String word:words)
       {
         i=  (int) word.charAt(word.length()-1)-'0';
           System.out.println(i);
        results[i] = word.substring(0,word.length()-1);
       }


       for(String result:results)
       {
           System.out.println(result);
       }
       return "";
    }
}
