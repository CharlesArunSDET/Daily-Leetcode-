package Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReplaceWords {

    public static void main(String[] args) {
         List<String> list = new ArrayList<>();
         list.add("cat");
         list.add("bat");
         list.add("rat");
        System.out.println(replaceWords(list,"the cattle was rattled by the battery"));
    }

    public static String replaceWords(List<String> dictionary, String sentence) {
        Set<String> rootSet = new HashSet<>(dictionary);

        StringBuilder result = new StringBuilder();
        String[] words = sentence.split("\\s+");

        for (String word : words) {
            String prefix = "";
            for (int i = 1; i <= word.length(); i++) {
                prefix = word.substring(0, i);
                if (rootSet.contains(prefix)) {
                    break;
                }
            }
            if (!result.isEmpty()) {
                result.append(" ");
            }
            result.append(prefix);
        }

        return result.toString();
    }
}
