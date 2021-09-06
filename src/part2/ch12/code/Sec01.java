package part2.ch12.code;

public class Sec01 {
}

// 3 예외의 종류
// - 사용자 정의 예외
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}