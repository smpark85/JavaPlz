package part1.ch05.prac5_3;

public class Prac5_3 {
    public static void main(String[] args) {
        // 1 - 콤마가 아닌 세미콜론을 추가
        for (int i = 0; i < 10; i++) { // , => ;
            System.out.printf("%d ", i);
        }

        // 2 - 무한 루프에 빠지지 않게 해야 함.
        int n = 1;
        while (n < 3) {
            System.out.printf("%d ", n++); // n => n++
        }
    }
}
