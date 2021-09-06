package part1.ch02.prac2_9;

public class PositionCalculator {
    public static void main(String[] args) {
        // 변수 생성
        double time = 5.0;               // 이동 시간
        double gravity = -9.81;          // 중력 가속도
        double initialVelocity = 0.0;    // 초기 속도
        double initialPosition = 1000.0; // 초기 위치

        // x(t) = 0.5at^2 + v0t + x0
        double finalPosition = 0.5 * gravity * time * time;
        finalPosition += initialVelocity * time;
        finalPosition += initialPosition;

        // 결과 출력
        System.out.printf("%.2f초 후 위치: %.2fm\n", time, finalPosition);
    }
}
