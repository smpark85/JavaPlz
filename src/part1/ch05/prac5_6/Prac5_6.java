package part1.ch05.prac5_6;

public class Prac5_6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i + j == 10) {
                    System.out.printf("(%d, %d)\n", i, j);
                }
            }
        }
    }
}
