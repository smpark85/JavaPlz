package part1.ch05.lab5_3;

public class GuGuDan {
    public static void main(String[] args) {
        printGuGuDan();
    }

    public static void printGuGuDan() {
        for (int n = 2; n <= 9; n++) {
            printDan(n);
        }
    }

    public static void printDan(int dan) {
        System.out.printf("%d단\n", dan);
        for (int i = 1; i <= 9; i++) {
            System.out.printf("\t");
            System.out.printf("%d x %d = %d\n", dan, i, dan * i);
        }
    }
}