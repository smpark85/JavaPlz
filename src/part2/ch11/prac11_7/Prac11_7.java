package part2.ch11.prac11_7;

public class Prac11_7 {
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
    protected int hp;
    public void slash(){}
}

class HolyKnight extends Knight implements Healer {
    protected int dp;
    public void heal() {}
    public void recovery() {}
}

class MagicKnight extends Knight implements Magician {
    protected int mp;
    public void magicShield() {}
    public void teleport() {}
}