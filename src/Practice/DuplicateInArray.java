package Practice;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInArray
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 2, 4};
        System.out.println("Duplicates: " + findDuplicates(arr));
    }

    public static Set<Integer> findDuplicates(int[] array)
    {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();

        for (int arr:array)
        {
            if(!seen.contains(arr))
            {
                seen.add(arr);
            }
            else
            {
                duplicate.add(arr);
            }
        }
        return duplicate;
    }
}
