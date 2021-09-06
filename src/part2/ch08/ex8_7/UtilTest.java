package part2.ch08.ex8_7;

public class UtilTest {
    public static void main(String[] args) {
        Util.m1();
        //Util.m2();
        Util util = new Util();
        util.m2();
    }
}

class Util {
    static void m1() {
        System.out.println("클래스 메소드 m1()가 호출되었습니다.");
    }

    void m2() {
        System.out.println("인스턴스 메소드 m2()가 호출되었습니다.");
    }
}