package part1.ch04.ex4_6;

public class Scholarship {
    public static void main(String[] args) {
        printScholarship("Park", 100, 92);
        printScholarship("Kim", 82, 96);
        printScholarship("Choi", 82, 88);
    }

    // 정수를 입력받아, 홀수나 짝수 여부를 출력하는 메소드
    public static void printScholarship(String name, int math, int eng) {
        String result = "";

        if (math >= 90 && eng >= 90) {
            result = "전액 장학금!";
        } else if (math >= 90 || eng >= 90) {
            result = "반액 장학금!";
        } else {
            result = "다음 기회에~";
        }
        System.out.printf("%s => %s\n", name, result);
    }
}