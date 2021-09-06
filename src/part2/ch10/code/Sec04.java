package part2.ch10.code;

public class Sec04 {
    public static void main(String[] args) {
        // 1 추상 클래스란
        // Animal animal = new Animal(); // 에러 발생, 객체 생성 불가!
    }
}

abstract class Animal {
    String name;

    void cry() {
        System.out.println("동물이 웁니다");
    }
}

class Tiger extends Animal {
    void cry() {
        System.out.println("어흥!");
    }
}

class Lion extends Animal {
    void cry() {
        System.out.println("크아앙!");
    }
}

class Dog extends Animal {
    void cry() {
        System.out.println("멍멍!");
    }
}

class Cat extends Animal {
    void cry() {
        System.out.println("야옹~");
    }
}