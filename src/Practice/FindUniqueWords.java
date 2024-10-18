package Practice;

import java.util.*;

public class FindUniqueWords {

    public static void main(String[] args) {
          String[] result = uncommonFromSentences("this apple is sweet", "this apple is sour");

        System.out.println(Arrays.toString(result));
    }

    public static String[] uncommonFromSentences(String s1, String s2)
    {
        String[] s1Array = s1.split("\\s");
        String[] s2Array = s2.split("\\s");

        Map<String,Integer> map = new HashMap<>();

        for (String string:s1Array)
        {
            map.put(string,map.getOrDefault(string,0)+1);
        }

        for (String string:s2Array)
        {
            map.put(string,map.getOrDefault(string,0)+1);
        }

        List<String> list = new ArrayList<>();
        int i=0;

        for(Map.Entry<String,Integer> entry: map.entrySet())
        {
            if(entry.getValue()==1)
            {
                list.add(entry.getKey());
                i++;
            }
        }
        return list.toArray(new String[0]);
    }
}

