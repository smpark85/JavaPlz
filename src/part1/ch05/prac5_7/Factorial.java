package part1.ch05.prac5_7;

public class Factorial {
    public static void main(String[] args) {
        printFactorial(3);
    }

    public static void printFactorial(int n) {
        System.out.printf("%d! = ", n);
        for (int i = n; i > 0; i--) {
            System.out.printf("%d", i);
            if (i == 1) {
                continue;
            }
            System.out.printf(" x ");
        }
    }
}
