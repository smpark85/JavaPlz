package part1.ch02.code;

public class Sec04 {
    public static void main(String[] args) {
        // 1 숫자 연산의 결과 타입
        int a = 5 / 2;      // 2(O), 2.5(X)
        double b = 5 / 2.0; // 2.5

        // 2 타입 불일치
        // int score  = "100" ; // 타입 불일치, 컴파일 에러 발생
        int score = 100; // int로 통일
        // String score = "100"; // String으로 통일

        // 3 타입 변환
        // - 자동 변환
        double p = 2; // 정수 2가 대입을 통해, 2.0으로 자동 변환
        //int q = 10.4; // 대입 불가, 컴파일 에러 발생

        // - 직접 변환
        int r = (int) 10.4; // r = 10
        double s = (double) 7; // s = 7.0

        // 4 문자열과 숫자간 타입 변환
        // - 문자열 연결
        String three = "3";
        String seven = "7";
        System.out.println(three + seven); // "37"을 출력

        // - 문자열을 숫자로
        int x = Integer.parseInt("3");
        int y = Integer.parseInt("7");
        System.out.println(x + y); // 10을 출력
        double z = Double.parseDouble("-9.81");    // z = -9.81

        // - 숫자를 문자열로
        String aa = "" + 1234;           // 문자열 "1234" 생성
        String bb = "" + 3.14;           // 문자열 "3.14" 생성
        String cc = Integer.toString(123); // 문자열 "123" 생성
        String dd = Double.toString(1.23); // 문자열 "1.23" 생성
    }
}
