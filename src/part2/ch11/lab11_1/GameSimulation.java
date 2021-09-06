package part2.ch11.lab11_1;

public class GameSimulation {
    public static void main(String[] args) {
        Knight atomic = new Knight("아토믹");
        Knight uther = new HolyKnight("우서");
        Knight genji = new MagicKnight("겐지");
        atomic.slash();
        uther.slash();
        genji.slash();
        Healer healer = (uther instanceof Healer) ?
                (HolyKnight) uther : null;
        healer.heal();
        healer.recovery();
        Magician magician = (genji instanceof Magician) ?
                (MagicKnight) genji : null;
        magician.magicShield();
        magician.teleport();
    }
}

interface Healer {
    void heal();

    void recovery();
}

interface Magician {
    void magicShield();

    void teleport();
}

class Knight {
    protected String name;
    protected int hp = 100;

    public Knight(String name) {
        this.name = name;
    }

    public void slash() {
        System.out.printf("[%s]의 일반 베기 공격!\n", name);
    }
}

class HolyKnight extends Knight implements Healer {
    protected int dp = 100; // 신력

    public HolyKnight(String name) {
        super(name);
    }

    public void heal() {
        System.out.printf("[%s]의 체력이 가득 찹니다.\n", name);
    }

    public void recovery() {
        System.out.printf("[%s]의 체력 회복력이 증가합니다.\n", name);
    }

    public void slash() {
        System.out.printf("[%s]의 신성력이 깃든 베기 공격!!!\n", name);
    }
}

class MagicKnight extends Knight implements Magician {
    protected int mp = 100; // 마력

    public MagicKnight(String name) {
        super(name);
    }

    public void magicShield() {
        System.out.printf("[%s]가 모든 공격을 튕겨냅니다.\n", name);
    }

    public void teleport() {
        System.out.printf("[%s]가 순간이동을 시전합니다.\n", name);
    }

    public void slash() {
        System.out.printf("[%s]의 마력이 깃든 베기 공격!!!\n", name);
    }
}