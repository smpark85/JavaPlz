package part1.ch03.prac3_5;

public class Walking {
    public static void main(String[] args) {
        int n = 5000;
        double x = calculate(5000);
        System.out.printf("%d번 걸었을 시의 소모 칼로리는 %.1f kcal입니다.", n, x);
    }

    public static double calculate(int walkingCount) { // int => double
        return 0.02 * walkingCount;
    }
}
