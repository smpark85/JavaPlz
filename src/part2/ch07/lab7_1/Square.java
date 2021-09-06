package part2.ch07.lab7_1;

public class Square {
    int length; // 한 변의 길이

    int area() {
        return length * length; // 정사각형의 넓이 반환
    }

    public static void main(String[] args) {
        Square s = new Square(); // 정사각형 객체 생성
        s.length = 4; // 한 변의 길이를 4로 변경
        System.out.printf("한 변의 길이가 %d인 정사각형의 넓이: %d",
                s.length, s.area());
    }
}