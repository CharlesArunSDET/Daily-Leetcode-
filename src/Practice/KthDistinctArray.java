package Practice;

import java.util.HashMap;
import java.util.Map;

public class KthDistinctArray {
    public static void main(String[] args) {
        System.out.println(kthDistinct(new String[] {"d","b","c","b","c","a"},2));
    }

    public static String kthDistinct(String[] arr, int k) {
        int counter = 1;
        Map<String,Integer> map = new HashMap<>();
        for(String str: arr )
        {
            map.put(str,map.getOrDefault(str,0)+1);
        }
        String output = "";
        for (String str: arr )
        {
            if(map.get(str).equals(1))
            {
                if(counter==k) {
                    output = str;
                    break;
                }
                counter++;
            }

        }
        return output;
    }
}
