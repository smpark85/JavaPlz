package part1.ch02.prac2_8;

public class SumDigits {
    public static void main(String[] args) {
        // 변수 생성
        int number = 374;
        // 계산
        int one = number % 10;               // 1의 자리 숫자
        int ten = number / 10 % 10;          // 10의 자리 숫자
        int hundred = number / 10 / 10 % 10; // 100의 자리 숫자
        int sum = one + ten + hundred;
        // 출력
        System.out.printf("정수 %d의 각 자릿수의 총합: %d", number, sum);
    }
}