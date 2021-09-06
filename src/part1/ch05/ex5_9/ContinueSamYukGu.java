package part1.ch05.ex5_9;

public class ContinueSamYukGu {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 3 || i == 6 || i == 9) {
                System.out.printf("짝 ");
                continue;
            }
            System.out.printf("%d ", i);
        }
    }
}