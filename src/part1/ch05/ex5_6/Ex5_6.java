package part1.ch05.ex5_6;

public class Ex5_6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("i = %d, ", i);
            if (i == 3) {
                break;
            }
        }
    }
}
