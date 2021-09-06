package part1.ch03.prac3_8;

public class Gasoline {
    public static void main(String[] args) {
        // 가솔린 사용량
        double gasoline = 8.86;
        // 이동 거리
        double distance = 182.736;
        // 연비 계산
        double efficiency = calcEffiency(gasoline, distance);
        System.out.printf("연비: %.2f km/L", efficiency);
    }

    public static double calcEffiency(double fuel, double distance) {
        return distance / fuel; // 연비 = 이동거리 / 사용량
    }
}