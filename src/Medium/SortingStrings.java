package Medium;

import java.util.*;

public class SortingStrings {

   /* ['tan', 'eat', 'bat', 'tea', 'nat', 'ate']
    To
[[bat],[nat, tan], [ate, eat, tea]]*/



    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("tan", "eat", "bat", "tea", "nat", "ate"));
        List<List<String>> lists =   sortTheStrings(list);

        for (List<String>group:lists)
        {
            System.out.println(group);
        }
    }

    public static List<List<String>> sortTheStrings(List<String> list)
    {


        Map<String,List<String>> map = new HashMap<>();
        for(String listValue: list)
        {

            char[] arr = listValue.toCharArray();
            Arrays.sort(arr);
           String word = new String(arr);

            map.computeIfAbsent(word,k-> new ArrayList<>()).add(listValue);
        }

        return new ArrayList<>(map.values());
    }
}
