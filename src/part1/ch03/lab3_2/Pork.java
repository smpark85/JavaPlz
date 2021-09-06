package part1.ch03.lab3_2;

public class Pork {
    public static void main(String[] args) {
        int n = 3;
        double x = calculate(n);
        System.out.printf("삼겹살 %d인분의 칼로리: %.2f kcal", n, x);
    }

    // 삼겹살 n인분의 칼로리를 반환하는 메소드
    public static double calculate(int amount) {
        int totalGram = amount * 180; // 1인분당 180g 이므로
        double totalKcal = totalGram * 5.179; // 1g당 5.179kcal 이므로
        return totalKcal;
    }
}