package part2.ch12.ex12_7;

public class ThrowsTest {
    public static void main(String[] args) {
        try {
            aaa();
        } catch (MyException ex) {
            ex.printStackTrace();
        }
    }

    private static void aaa() throws MyException {
        System.out.println("aaa() 메소드가 호출되었습니다.");
        bbb();
    }

    private static void bbb() throws MyException {
        System.out.println("bbb() 메소드가 호출되었습니다.");
        throw new MyException("bbb()에서 예외 발생");
    }
}

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}