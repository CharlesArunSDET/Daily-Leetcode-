package easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PrimeNumbersInList {
    public static void main(String[] args) {

            List<Integer> list = new ArrayList<>();
            list.add(7);
            list.add(2);
            list.add(4);
        list.add(6);
        list.add(5);
        list.add(9);

        findPrimeNumber(list);
    }

    public static List<Integer> findPrimeNumber(List<Integer> list)
    {
        List<Integer> result = new LinkedList<>();
        for (int number:list)
        {
            if(number%2==0)
            {
                result.add(number);
            }
        }


        return result;
    }
}
