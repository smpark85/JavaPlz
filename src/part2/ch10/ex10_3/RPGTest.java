package part2.ch10.ex10_3;

public class RPGTest {
    public static void main(String[] args) {
        Wizard wizard = new Wizard();
        wizard.speed = 2;
        wizard.move();
        Knight knight = new Knight();
        knight.speed = 3;
        knight.move();
    }
}

class Novice {
    String name;
    int hp;
    int speed;

    void punch() {
        System.out.printf("%s(HP: %d)의 펀치!\n", name, hp);
    }

    void move() {
        System.out.printf("%d 만큼 이동합니다.\n", speed);
    }
}

class Wizard extends Novice {
    int mp;

    void fireball() {
        System.out.printf("%s(HP: %d, MP: %d)의 파이어볼~@\n", name, hp, mp);
    }
}

class Knight extends Novice {
    int stamina;

    void slash() {
        System.out.printf("%s(HP: %d, ST: %d)의 슬래쉬!!\n", name, hp, stamina);
    }
}