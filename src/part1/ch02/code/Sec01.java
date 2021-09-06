package part1.ch02.code;

public class Sec01 {
    public static void main(String[] args) {
        // 1 변수
        int age;

        // 2 타입
        // - 기본 타입
        int mathScore;     // 정수(int) 타입 변수 mathScore를 생성
        double weight;     // 실수(double) 타입 변수 weight를 생성
        boolean finished;   // 논리(booelan) 타입 변수 finished를 생성
        char alphabet;      // 문자(char) 타입 변수 alphabet을 생성

        // - 레퍼런스 타입
        String bookTitle = "자바를 부탁해";   // String 타입 변수 bookTitle을 생성

        // 3 연산자
        // - 연산자 우선순위
        int result;
        result = 3 + 8 * (3 - 1);      // result = 19;

        // - 증감 전위 연산자
        int a = 1;
        int b = 1;

        System.out.println(++a);   // 2 출력
        System.out.println(--b);    // 0 출력

        // - 증감 후위 연산자
        int c = 1;
        int d = 1;

        System.out.println(c++);   // 1 출력
        System.out.println(d--);    // 1 출력

        // - Quiz1
        int x = 6;
        int y = 3;
        System.out.println(x / y); // 2
        System.out.println(x % y); // 0
        System.out.println(30 - 2 * (5 + 4)); // 12
        System.out.println(++x * y--); // 21
    }
}
