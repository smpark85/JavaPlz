package part2.ch10.prac10_6;

public class Prac10_6 {
    public static void main(String[] args) {
        Airplane a = new PropellerPlane();
        Airplane b = new JetEnginePlane();
        Airplane c = new PaperAirplane();
        Airplane[] airplanes = { a, b, c };
        for (int i = 0; i < airplanes.length; i++) {
            airplanes[i].fly();
        }
    }
}

abstract class Airplane {
    protected String name;

    public void fly() {
        System.out.printf("[%s]가 날아갑니다.\n", name);
    }
}

class PropellerPlane extends Airplane {
    public void fly() {
        System.out.printf("[프로펠러 비행기] 프로펠러를 돌리며 날아갑니다.\n", name);
    }
}

class JetEnginePlane extends Airplane {
    public void fly() {
        System.out.printf("[제트엔진 비행기] 제트 엔진을 뿜으며 날아갑니다.\n", name);
    }
}

class PaperAirplane extends Airplane {
    public void fly() {
        System.out.printf("[종이 비행기] 바람을 타고 날아갑니다\n", name);
    }
}
