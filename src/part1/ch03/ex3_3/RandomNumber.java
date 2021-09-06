package part1.ch03.ex3_3;

public class RandomNumber {
    public static void main(String[] args) {
        int n = rollDie();
        System.out.printf("주사위의 눈: %d", n);
    }

    // 1이상 6이하의 임의의 정수를 반환하는 메소드
    public static int rollDie() {
        double x = 6 * Math.random();
        int temp = (int) x;
        return temp + 1;
    }
}