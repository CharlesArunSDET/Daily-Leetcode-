package easy;

public class CasingChallenge {
    public static void main(String[] args) {


        changeOddCasing("friday");
    }
/*
    Write a program to change a string "friday" to "fRiDaY"*/

    public static void changeOddCasing(String input)
    {

        for(int i=0;i<input.length();i++)
        {
            if(i%2==1)
            {
                System.out.print(Character.toUpperCase(input.charAt(i)));
            }
            else
            {
                System.out.print(input.charAt(i));
            }
        }

    }
}


