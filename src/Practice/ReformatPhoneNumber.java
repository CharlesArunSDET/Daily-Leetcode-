package Practice;

public class ReformatPhoneNumber {

    public static void main(String[] args)
    {
reformatNumber("123-456");
    }

    public static String reformatNumber(String number) {
       String output =  number.replace('-',' ').replaceAll("\\s","");
        if(output.length()%6==0)
        {

        }
        return output;
    }
}
