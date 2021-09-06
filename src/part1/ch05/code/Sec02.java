package part1.ch05.code;

public class Sec02 {
    public static void main(String[] args) {
        // 1 while 문
        int n = 1;
        System.out.println(n);
        n = n + 1;
        System.out.println(n);
        n = n + 1;
        System.out.println(n);
        n = n + 1;
        System.out.println("END");

        // 2 for 문
        // - 구구단 3단
        System.out.printf("3 x %d = %d\n", 1, 3 * 1); // 3 x 1 = 3
        System.out.printf("3 x %d = %d\n", 2, 3 * 2); // 3 x 2 = 6
        System.out.printf("3 x %d = %d\n", 3, 3 * 3); // 3 x 3 = 9
        System.out.printf("3 x %d = %d\n", 4, 3 * 4); // 3 x 4 = 12
        System.out.printf("3 x %d = %d\n", 5, 3 * 5); // 3 x 5 = 15
        System.out.printf("3 x %d = %d\n", 6, 3 * 6); // 3 x 6 = 18
        System.out.printf("3 x %d = %d\n", 7, 3 * 7); // 3 x 7 = 21
        System.out.printf("3 x %d = %d\n", 8, 3 * 8); // 3 x 8 = 24
        System.out.printf("3 x %d = %d\n", 9, 3 * 9); // 3 x 9 = 27

        // - 1부터 10까지의 총합
        int sum = 0;
        sum = sum + 1;
        sum = sum + 2;
        sum = sum + 3;
        sum = sum + 4;
        sum = sum + 5;
        sum = sum + 6;
        sum = sum + 7;
        sum = sum + 8;
        sum = sum + 9;
        sum += 10; // sum = sum + 10;
        System.out.printf("총합: %d", sum);
        System.out.println();

        // Quiz1 - 5개
        int num = 5;
        while (--num > 0) { // 5, 4, 3, 2, 1
            System.out.print("* ");
        }
        System.out.println();
        // Quiz2 - 6개
        for (int i = 0; i <= 5; i++) {
            System.out.print("* ");
        }
    }
}
