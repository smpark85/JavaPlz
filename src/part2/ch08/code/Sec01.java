package part2.ch08.code;

public class Sec01 {
    public static void main(String[] args) {
        // 1 생성자란
        // - 기존 방법
        Cat c = new Cat();
        c.name = "네로";
        c.breeds = "페르시안";
        c.weight = 3.78;

        // 2 생성자 호출과 정의
        Cat c2 = new Cat("네로", "페르시안", 3.78);

        // 4 디폴트 생성자
        // - 생성자 호출 코드
        Cola cola = new Cola();
    }
}

// 2 생성자 호출과 정의
class Cat {
    // 필드(객체의 상태)
    String name;
    String breeds;
    double weight;

    // 생성자 정의, 객체의 생성과 초기화를 담당
    Cat(String n, String b, double w) {
        name = n;
        breeds = b;
        weight = w;
    }

    // 디폴트 생성자
    Cat() {}
}

// 4 디폴트 생성자
class Cola {
    String name;
    int price;

    // 디폴트
}