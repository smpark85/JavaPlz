package part1.ch05.lab5_2;

public class StarRightTriangle {
    public static void main(String[] args) {
        for (int row = 0; row < 5; row++) {
            for (int i = 0; i < row + 1; i++) {
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
}
