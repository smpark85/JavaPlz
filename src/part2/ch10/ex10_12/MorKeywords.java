package part2.ch10.ex10_12;

public class MorKeywords {
    public static void main(String[] args) {
        Weapon w1 = new Weapon("장검", 1200, 10);
        Weapon w2 = new Weapon();
        w1.printInfo();
        w2.printInfo();
    }
}

abstract class Item {
    String name; // 이름
    int price; // 가격

    Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    Item() {
        this.name = "이름 없음";
        this.price = -1;
    }
}

class Weapon extends Item {
    int power; // 공격력

    Weapon(String name, int price, int power) {
        super(name, price);
        this.power = power;
    }

    Weapon() {
        super();
        this.power = -1;
    }

    void printInfo() {
        System.out.printf("[%s] 가격: %d 골드, 공격력: %d\n",
                super.name, super.price, this.power);
    }
}