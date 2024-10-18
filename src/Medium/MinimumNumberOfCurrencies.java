package Medium;

public class MinimumNumberOfCurrencies {

    public static void main(String[] args) {
    findMinimumNotesCount(2304);
    }

    public static void findMinimumNotesCount(int amount)
    {
        int[] notes = new int[] {2000,500, 200, 100, 50, 20, 10, 5, 1};
        int[] counter = new int[9];
        int i=0;

        for(int note:notes)
        {
            if(amount>=note)
            {
                counter[i] = amount/note;
                amount=amount%note;

            }
            i++;
        }


        for (int count:counter)
        {
            System.out.println(count);
        }
    }

}
