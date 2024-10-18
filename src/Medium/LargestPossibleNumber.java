package Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestPossibleNumber {

    public static void main(String[] args) {
        System.out.println(largestNumber(new int[] {3,30,34,5,9}));
    }

    public static String largestNumber(int[] nums) {


        List <Integer> list = new ArrayList<>();

        for (int c:nums)
        {
           list.add(c);
        }

        list.sort(Collections.reverseOrder());

        System.out.println(list);

        StringBuilder result =  new StringBuilder();

        for(int num:list)
        {
            result.append(num);
        }

       return result.toString();
    }
}
