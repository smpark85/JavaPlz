package part2.ch12.ex12_5;

public class CheckedExceptionTest {
    public static void main(String[] args) /* throws InterruptedException */ {
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d ", i);
            //Thread.sleep(1000); // 1.000초간 실행을 멈춤
        }
    }
}