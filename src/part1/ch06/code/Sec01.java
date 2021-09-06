package part1.ch06.code;

public class Sec01 {
    public static void main(String[] args) {
        // 1 배열이란
        // int[] scores = { 88, 98, 68, 72, 47 };

        // 2 배열의 필요성
        // a - 변수 사용 코드
        int a = 88;
        int b = 98;
        int c = 68;
        int d = 72;
        int e = 47;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        // b - 배열 사용 코드
        int[] scores = {88, 98, 68, 72, 47};
        for (int i = 0; i < 5; i++) {
            System.out.println(scores[i]);
        }

        // 3 배열의 특징
        // - 모두 같은 타입
        int[] points = {10, 7, 9, 9};
        double[] weights = {68.3, 82.1, 52.7, 58.9};

        // - 인덱스로 구분
        String[] names = {"Kim", "Lee", "Park"};

        // - 고정된 길이
        boolean[] flags = {true, false, false, true};
        System.out.println(flags.length); // 4 출력

    }
}
