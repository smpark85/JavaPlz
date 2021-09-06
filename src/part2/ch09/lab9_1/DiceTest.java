package part2.ch09.lab9_1;

import java.util.Random; // Random 클래스 API를 불러옴

public class DiceTest {
    public static void main(String[] args) {
        Dice diceA = new Dice(6);
        Dice diceB = new Dice(6);

        // 두 주사위 A와 B의 합을 기록할 배열, 인덱스 범위(0~12)
        int[] counts = new int[13];

        // 두 주사위의 합을 기록, 100회 반복
        for (int n = 0; n < 100; n++) {
            int a = diceA.roll();
            int b = diceB.roll();
            int sum = a + b;
            counts[sum]++;
        }

        // 결과 출력
        for (int i = 2; i < counts.length; i++) {
            System.out.printf("%2d: %d\n", i, counts[i]);
        }
    }
}

class Dice {
    private int sides; // 주사위 면의 개수
    private static Random rand = new Random(); // Dice가 공유할 Random 객체

    public Dice(int _sides) {
        sides = _sides;
    }

    public int roll() {
        // Random 객체로 임의의 정수를 생성, 주사위 면의 개수를 기준으로 함
        return rand.nextInt(sides) + 1;
    }
}