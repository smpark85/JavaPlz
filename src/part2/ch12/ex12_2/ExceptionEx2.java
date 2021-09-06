package part2.ch12.ex12_2;

public class ExceptionEx2 {
    public static void main(String[] args) {
        String[] names = {"Kim", "Lee", "Park", "Choi"};
        try {
            System.out.printf("0번 인덱스 요소: %s\n", names[0]);
            System.out.printf("4번 인덱스 요소: %s\n", names[4]);
            System.out.printf("3번 인덱스 요소: %s\n", names[3]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("인덱스 접근이 잘못되었습니다.");
        } finally {
            System.out.println("finally 문은 예외 발생과 상관없이 항상 수행됩니다.");
        }
        System.out.println("프로그램이 종료됩니다.");
    }
}
