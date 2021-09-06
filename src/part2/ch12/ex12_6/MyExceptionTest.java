package part2.ch12.ex12_6;

public class MyExceptionTest {
    public static void main(String[] args) {
        try {
            throw new MyException("예외 발생시키기!!");
        } catch (MyException ex) {
            System.out.printf("예외 메시지: %s\n", ex.getMessage());
        }
    }
}

class MyException extends Exception {
    public MyException() {
        super("내가 만든 예외 발생");
    }

    public MyException(String message) {
        super(message);
    }
}