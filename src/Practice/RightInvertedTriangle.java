package Practice;

public class RightInvertedTriangle {


   /*       1

            2   3

            4   5  6

            7   8  9 10

            11 12  13

            14 15

            16

            1

            2 3

            4 5 6

            7 8

            9*/
    public static void main(String[] args)
    {

        printTriangle(4);

    }

    public static void printTriangle(int number)
    {
        int printNumber = 1;
        for(int i=1;i<=number;i++)
        {
            for(int j=1;j<=i;j++)
            {

                System.out.print(printNumber +" ");
                printNumber++;
            }
            System.out.println();
        }

        for(int i=number-1;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {

                System.out.print(printNumber +" ");
                printNumber++;
            }
            System.out.println();
        }


    }
}
