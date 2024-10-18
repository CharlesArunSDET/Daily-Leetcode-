package Medium;

public class StudentWhoReplacesChalk {

    public static void main(String[] args) {

        System.out.println(chalkReplacer(new int[] {5,1,5},22));
    }

    public  static int chalkReplacer(int[] chalk, int k) {

        long accSum = 0;
        for (int c : chalk) {
            accSum += c;
        }

        k %= (int) accSum;

        for (int i = 0; i < chalk.length; i++)
        {
            if (chalk[i] > k) {
                return i;
            }
            k -= chalk[i];
        }
        return -1;
    }
}
