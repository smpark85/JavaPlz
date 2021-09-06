package part2.ch07.ex7_1;

public class Cat {
    String name; // 이름
    String breeds; // 품종
    double weight; // 체중

    void claw() {
        System.out.println("할퀴기!!");
    }

    void meow() {
        System.out.println("야옹~");
    }

    public static void main(String[] args) {
        // 객체 생성
        Cat c = new Cat();

        // 객체 상태(필드) 변경
        c.name = "네로";
        c.breeds = "페르시안";
        c.weight = 4.37;

        // 객체 상태(필드) 출력
        System.out.printf("이름: %s\n", c.name);
        System.out.printf("품종: %s\n", c.breeds);
        System.out.printf("체중: %.2fkg\n", c.weight);
    }
}