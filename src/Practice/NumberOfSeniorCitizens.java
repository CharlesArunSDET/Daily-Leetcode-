package Practice;

public class NumberOfSeniorCitizens {

    public static void main(String[] args)
    {
        countSeniors(new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"});
    }

    public static int countSeniors(String[] details)
    {
        int counter = 0;

        for(String id: details)
        {
            if(Integer.parseInt(id.substring(11,13))>60)
            {
                counter++;
            }
        }

        return counter;
    }
}
