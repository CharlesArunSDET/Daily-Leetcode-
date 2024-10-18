package easy;

public class SwapWithoutSpecialCharacter {

    public static void main(String[] args) {
        System.out.println(swapCharacterWithoutSpecialCharacter("Test1ng-Leet=code-Q!"));
    }

    public static String swapCharacterWithoutSpecialCharacter(String string)
    {

        char[] arr = string.toCharArray();
        int i = 0, j = arr.length - 1;

        while (i < j) {
            if (!Character.isLetter(arr[i])) {
                i++;
            } else if (!Character.isLetter(arr[j])) {
                j--;
            } else {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }
}
