package part1.ch03.code;

public class Sec02 {
    public static void main(String[] args) {
        // 3 메소드 호출하기
        int m = square(3); // m = 9
        int n = square(4); // n = 16
        double x = Math.abs(-9.81); // x = 9.81
        int y = Math.max(3, 7); // y = 7

        // Quiz
        System.out.println(Math.abs(3.14));     // 3.14
        System.out.println(Math.max(10, 100));  // 100
        System.out.println(Math.min(10, 100));  // 10
    }

    // 1 메소드 정의하기
    public static int square(int n) {
        return n * n;
    }
}
