package Practice;

import java.util.*;

public class SortArrayByIncreasingFrequency {
    public static void main(String[] args) {
      int[] result =frequencySort(new int[] {1,1,2,2,2,3});

      System.out.println(Arrays.toString(result));
    }

    public static int[] frequencySort(int[] nums) {
        Map<Integer,Integer> frequencyMap = new HashMap<>();
        for(int number:nums)
        {
            frequencyMap.merge(number,1,Integer::sum);
        }

        for (Map.Entry<Integer,Integer> entry:frequencyMap.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(frequencyMap.entrySet());

        // Sort the list based on values
        entryList.sort(Map.Entry.comparingByValue());

        // Extract the sorted keys
        int[] sortedKeys = new int[entryList.size()];
        for (int i = 0; i < entryList.size(); i++) {
            sortedKeys[i] = entryList.get(i).getKey();
        }

        return sortedKeys;
    }
}
