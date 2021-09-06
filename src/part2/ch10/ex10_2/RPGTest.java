package part2.ch10.ex10_2;

public class RPGTest {
    public static void main(String[] args) {
        Knight knight = new Knight();
        knight.name = "킹아서";
        knight.hp = 150;
        knight.stamina = 70;
        knight.punch();
        knight.slash();
    }
}

class Novice {
    String name;
    int hp;

    void punch() {
        System.out.printf("%s(HP: %d)의 펀치!\n", name, hp);
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