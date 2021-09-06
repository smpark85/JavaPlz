package part2.ch07.code;

public class Sec03 {
    public static void main(String[] args) {
        // 1 객체 생성하기
        Cat c = new Cat();

        // 2 필드 사용하기
        // - 인스턴스변수
        System.out.printf("이름: %s\n", c.name);
        System.out.printf("품종: %s\n", c.breeds);
        System.out.printf("체중: %.2fkg\n", c.weight);

        // - 닷 연산자
        c.name = "네로"; // 이름을 "네로"로 변경
        c.breeds = "페르시안"; // 품종을 "페르시안"으로 변경
        c.weight = 4.37; // 체중을 4.37로 변경

        // 3 여러 객체 만들기
        Dog d1 = new Dog(); // Dog 객체 생성 후, d1 변수에 연결
        Dog d2 = new Dog(); // Dog 객체 생성 후, d2 변수에 연결

        // d1 객체의 상태 변경
        d1.name = "망고";
        d1.breeds = "골든리트리버";
        d1.age = 2;

        // d2 객체의 상태 변경
        d2.name = "까미";
        d2.breeds = "믹스";
        d2.age = 3;

        // 결과 출력
        System.out.printf("d1 => {%s, %s, %d세}\n", d1.name, d1.breeds, d1.age);
        System.out.printf("d2 => {%s, %s, %d세}\n", d2.name, d2.breeds, d2.age);

        // 4 인스턴스 메소드 호출하기
        // - 인스턴스 메소드
        d1.wag(); // 꼬리치기
        d2.bark(); // 짖기
    }
}

class Dog {
    String name; // 이름
    String breeds; // 품종
    int age; // 나이

    void wag() {
        System.out.printf("[%s] 살랑살랑~\n", name);
    }

    void bark() {
        System.out.printf("[%s] 멍멍!\n", name);
    }
}
