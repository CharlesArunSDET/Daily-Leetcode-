package easy;

import java.util.Random;

public class GenerateRandomStringLength {

    public static void main(String[] args) {

        GenerateRandomStringLength gen = new GenerateRandomStringLength();
        System.out.println(gen.generateString(3));
    }

    public String generateString(int length)
    {

       final String  characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
       StringBuilder sb = new StringBuilder();

       while(length>0)
       {
           Random  random = new Random();
           sb.append(characters.charAt(random.nextInt(0,characters.length())));
           length--;
       }
       return sb.toString();
    }
}
