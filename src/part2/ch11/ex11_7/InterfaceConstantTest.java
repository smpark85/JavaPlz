package part2.ch11.ex11_7;

public class InterfaceConstantTest {
    public static void main(String[] args) {
        System.out.printf("SUN: %s\n", MyInterface.SUN);
        System.out.printf("MON: %s\n", MyInterface.MON);
        System.out.printf("TUE: %s\n", MyInterface.TUE);
    }
}

interface MyInterface {
    public static final String SUN = "일요일";
    public static final String MON = "월요일";
    public static final String TUE = "화요일";
}