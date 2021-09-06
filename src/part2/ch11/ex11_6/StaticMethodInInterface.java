package part2.ch11.ex11_6;

public class StaticMethodInInterface {
    public static void main(String[] args) {
        System.out.printf("3 더하기 7 은 %d 입니다.\n", Calculator.plus(3, 7));
        System.out.printf("4 빼기 6 은 %d 입니다.\n", Calculator.minus(4, 6));
    }
}

interface Calculator {
    static int plus(int a, int b) {
        return a + b;
    }

    static int minus(int a, int b) {
        return a - b;
    }
}