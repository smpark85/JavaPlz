package part1.ch04.prac4_4;

public class Practice04 {
    public static void main(String[] args) {
        System.out.println(result(98));
        System.out.println(result(87));
        System.out.println(result(76));
        System.out.println(result(75));
    }

    public static boolean result(int x) {
        return (x > 95) || (x < 85) && (x % 2 == 0);
    }
}
