package part1.ch06.code;

public class Sec02 {
    public static void main(String[] args) {
        // 1 배열 만들기
        // - 초기화를 통한 생성
        int[] scores = {88, 98, 68, 72, 47};

        // - 길이 지정을 통한 생성
        double[] grades = new double[4];

        // 2 배열 읽고 쓰기
        // - Quiz3
        String[] strArr = {"프로그래밍", "완전", "너무", "싫어", "노는게", "좋아요", "극혐"};
        System.out.printf("%s, %s %s!", strArr[0], strArr[1], strArr[5]);

        // 3 인덱스의 범위
        int[] numbers = {88, 72, 96, 28, 60};
        System.out.println(numbers[-1]); // ERROR, 존재하지 않는 인덱스
        System.out.println(numbers[5]);  // ERROR, 존재하지 않는 인덱스
    }
}
