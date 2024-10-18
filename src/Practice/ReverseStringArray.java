package Practice;

public class ReverseStringArray {
    public static void main(String[] args) {

    }

    public void reverseString(char[] s) {
        int length = s.length;
        int i = 0;
        while(i<length)
        {
            char temp = s[i];
            s[i] = s[length];
            s[length] = temp;
            i++;
            length--;
        }
    }
}
