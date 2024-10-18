/*
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


*/
/*
Combination sum without duplicates

Input: candidates = [10,1,2,7,6,1,5], target = 8
Output:
        [
        [1,1,6],
        [1,2,5],
        [1,7],
        [2,6]
        ]
*//*


public class CombinationOfSums {
    public static void main(String[] args)
    {
        int target = 8;
        findCombinationOfSums(new int[] {10,1,2,7,6,1,5}, target);
    }

    public static List findCombinationOfSums(int[] array, int target)
    {
        Map<Integer,Integer> map = new HashMap<>();

        List<int[]> list = new ArrayList<>();
        for (int arr:array)
        {
            map.put(arr,map.getOrDefault(arr,0)+1);
        }

        for (int i=0;i<array.length;i++)
        {
            int[] arrValues = new int[array.length];
              int value = target -array[i];
              if(map.containsKey(value))
              {
                  arrValues[0] = array[i];
                  arrValues[1] = value;
                  list.add(arrValues);
              }
              else
              {
                  boolean flag = false;
                  for (int j=i+1,k=0;j<array.length-1;j++)
                  {

                      if (array[j]<value)
                      {
                          value = value - array[j];
                          arrValues[k]= array[j];
                          k++;
                          if(value==0)
                          {

                              break;
                          }
                      }
                  }
              }
        }
    }
}

*/
