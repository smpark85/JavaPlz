package part2.ch10.code;

public class Sec01 {
    public static void main(String[] args) {

    }
}

// 2 상속 사용 예
// - 상속 적용 전 Novice 클래스
class Novice {
    String name;
    int hp;
    void punch() {
        System.out.printf("%s(HP: %d)의 펀치!\n", name, hp);
    }
}

// - 상속 적용 후 Wizard 클래스
class Wizard extends Novice {
    int mp;
    void fireball() {
        System.out.printf("%s(HP: %d, MP: %d)의 파이어볼~@\n", name, hp, mp);
    }
}

class Knight extends Novice { // Novice 클래스를 기반으로 확장된 Knight 클래스
    int stamina; // 기력
    void slash() { // 칼로 베기 공격
        System.out.printf("%s(HP: %d, ST: %d)의 슬래쉬!!\n", name, hp, stamina);
    }
}