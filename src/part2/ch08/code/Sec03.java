package part2.ch08.code;

public class Sec03 {
    public static void main(String[] args) {
        // 2 클래스 변수
        Student.count += 1;
    }
}

// 2 클래스 변수
class Student {
    // 필드(객체의 상태)
    static int count = 0; // 클래스변수(static 필드)
    int id; // 인스턴스 변수(non-static 필드)
    String name; // 인스턴스 변수(non-static 필드)
}
