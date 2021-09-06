package part1.ch02.code;

public class Sec03 {
    public static void main(String[] args) {
        // 1 변수 생성 및 초기화
        String bookTitle = "자바를 부탁해";
        int mathScore = 88;
        double weight = 74.8;
        boolean finished = true;
        char alphabet = 'A';

        int myFirstVariable; // 카멜 표기법 예

        // 2 변수값 변경
        String str = "가나다라";
        int score = 68;
        str = "ABCD";
        score = 88;

        // 3 변수값 복사
        double origin = 3.14;
        double copy = origin;
        System.out.println(copy);    // "3.14" 출력

        // 4 문자열 연결
        String a = "안녕";
        String b = "하세요";
        String c = a + b;        // "안녕" + "하세요"
        System.out.println(c);   // "안녕하세요" 출력

        // 5 문자열과 숫자의 연결
        int hour = 13;
        System.out.println("지금은 " + hour + "시");
        double weight2 = 1.45;
        System.out.println("무게: " + weight2 + "kg");

        // Quiz1
        String numStr = "123";
        int n = 456;
        double m = 78.9;
        System.out.println(numStr + n + m); // "12345678.9"
    }
}
