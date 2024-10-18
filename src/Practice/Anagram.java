/*
package Practice;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    */
/*String s1 = "TREE";
    String ss = "ERET";*//*


    public static void main(String []args)
    {
        System.out.println(checkAnagram("TREE","ERET"));
    }

    public static boolean checkAnagram(String valuoe1,String value2)
    {
        System.out.println("abcde".substring(1,3));

        if(!(value1.length()==value2.length()))
        {
            return false;
        }

        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();

        for(char c:value1.toCharArray())

        {
            map1.put(Character.toUpperCase(c),map1.getOrDefault(Character.toUpperCase(c),0)+1);
        }
        for(char c:value2.toCharArray())
        {
            map2.put(Character.toUpperCase(c),map2.getOrDefault(Character.toUpperCase(c),0)+1);
        }


*/
/*
        System.out.println(map1);
        System.out.println(map2);*//*

       */
/* for(Map.Entry<Character,Integer> entry:map1.entrySet())
        {
            if(!(map2.containsKey(entry.getKey())&&map2.get(entry.getKey()).equals(entry.getValue())))
            {
                return false;
            }
        }*//*


       return map1.equals(map2);
    }



}
*/
