package part2.ch11.ex11_5;

public class DefaultMethodTest {
    public static void main(String[] args) {
        Vehicle b = new Bicycle();
        Vehicle t = new Train();
        b.horn();
        t.horn();
        b.move("명동", "신촌");
        t.move("서울", "부산");
    }
}

interface Vehicle {
    void horn();

    default public void move(String from, String to) {
        System.out.printf("%s에서 %s(으)로 이동합니다.\n", from, to);
    }
}

class Bicycle implements Vehicle { // 디폴트 메소드를 재정의하지 않았음
    public void horn() {
        System.out.println("따르릉~");
    }
}

class Train implements Vehicle {
    public void horn() {
        System.out.println("뿌우뿌우~");
    }

    public void move(String from, String to) { // 선택적 재정의된 디폴트 메소드
        System.out.printf("기차가 %s에서 %s(으)로 이동합니다.\n", from, to);
    }
}