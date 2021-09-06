package part1.ch05.ex5_8;

public class BreakForHiding {
    public static void main(String[] args) {
        printSum(1, 10);
    }

    // 입력 정수 start부터 end까지의 정수의 총합을 출력
    public static void printSum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            System.out.printf("%d", i);
            sum += i;
            if (i == end) {
                break;
            }
            System.out.printf(" + ");
        }
        System.out.printf(" = %d", sum);
    }
}