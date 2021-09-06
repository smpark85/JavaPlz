package part2.ch08.code;

public class Sec02 {
    public static void main(String[] args) {
        // 1 레퍼런스 변수란
        int[] scores = {88, 98, 68, 72};
        Hero ironMan = new Hero("아이언맨", 100, 120);

        // 2 기본 변수와의 차이
        // - 저장 데이터
        Dog kkami = new Dog("까미", 3);
        int age = 22;

        // - 원본 공유 여부
        Dog mango = new Dog();
        Dog puppy = mango;
        int n = age;

        // - 타입 표기
        Cat c;
        char alphabet;
    }
}

class Hero {
    String name;
    int hp;
    int mp;

    Hero(String s, int i1, int i2) {
        name = s;
        hp = i1;
        mp = i2;
    }
}

class Dog {
    String name;
    int age;

    Dog(String s, int i) {
        name = s;
        age = i;
    }

    Dog() {
    }
}