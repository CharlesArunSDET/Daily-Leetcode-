/*
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindTheLongestSubArray {
    */
/*Find the length of largest subarray with 0 sum
    Given an array of integers, find the length of the longest sub-array with sum equals to 0.
    Examples :
    Input: arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
    Output: 5
    Explanation: The longest sub-array with
    elements summing up-to 0 is {-2, 2, -8, 1, 7}
    Input: arr[] = {1, 2, 3}
    Output: 0
    Explanation:There is no subarray with 0 sum

    Input:  arr[] = {1, 0, 3}
    Output:  1
    Explanation: The longest sub-array with
    elements summing up-to 0 is {0}*//*


    public static void main(String[] args)
    {

    }

    public static int findLongestSubArray(int[] array)
    {
        Map<Integer,Integer> map = new HashMap<>();
        for (int arr:array)
        {
            map.put(arr,map.getOrDefault(arr,0)+1);
        }

        for(Map.Entry entry :map.entrySet())
        {
            if (entry.getKey().equals(0))
            {
                map.entrySet().
            }
        }
    }
}
*/
