package part1.ch03.prac3_6;

public class VariableScope {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("x = " + x); // 5
        print(x);
        System.out.println("x = " + x); // 5
    }

    public static void print(int x) {
        System.out.println("x = " + x); // 5
        x = x + 10;
        System.out.println("x = " + x); // 15
    }
}

