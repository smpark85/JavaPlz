package part2.ch12.ex12_1;

public class ExceptionEx1 {
    public static void main(String[] args) {
        String[] names = {"Kim", "Lee", "Park", "Choi"};
        System.out.println(names[4]); // 배열 인덱스를 벗어난 접근
        System.out.println("프로그램 수행 완료!");// 비정상 종료로 출력되지 않음
    }
}
