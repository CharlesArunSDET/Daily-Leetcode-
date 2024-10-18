package easy;

public class Challenge {
    public static void main(String[] args) {
        int a = 10;
        System.out.print(a += (a = 5) * (a / 5));
    }
}
