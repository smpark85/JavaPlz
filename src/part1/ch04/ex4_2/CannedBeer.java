package part1.ch04.ex4_2;

public class CannedBeer {
    public static void main(String[] args) {
        buy(20);
        buy(18);
    }

    // 입력 나이에 따라, 캔맥주 구매 가능 여부를 출력
    public static void buy(int age) {
        if (age >= 19) {
            System.out.printf("%d세, 캔맥주 구매 가능\n", age);
        } else {
            System.out.printf("%d세, 캔맥주 구매 불가\n", age);
        }
    }
}
