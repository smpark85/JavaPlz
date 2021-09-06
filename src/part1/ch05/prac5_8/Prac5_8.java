package part1.ch05.prac5_8;

public class Prac5_8 {
    public static void main(String[] args) {
        System.out.printf("1부터 100 사이의 정수 중,\n");
        System.out.printf("홀수의 합: %d\n", oddSum(1, 100));
        System.out.printf("짝수의 합: %d\n", evenSum(1, 100));
    }

    public static int oddSum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        return sum;
    }

    public static int evenSum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
