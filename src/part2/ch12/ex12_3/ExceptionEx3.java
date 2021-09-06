package part2.ch12.ex12_3;

import java.util.Scanner;

public class ExceptionEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 스캐너 객체 생성
        try {
            System.out.printf("10을 X로 나누려 한다.\nX의 값을 입력: ");
            String inputStr = scanner.next(); // 키보드 입력 문자열 받기
            int inputNum = Integer.parseInt(inputStr);
            // 입력 문자열을 정수로 변환
            int result = 10 / inputNum;
            System.out.printf("10 나누기 %d => %d\n", inputNum, result);
        } catch (NumberFormatException ex) {
            System.out.println("정수 변환에 실패하였습니다.");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
        System.out.println("프로그램이 종료됩니다.");
    }
}
