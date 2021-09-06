package part2.ch10.code;

import java.util.ArrayList;

public class Sec02 {
    public static void main(String[] args) {
        // 1 상속과 업 캐스팅
        Square s = new Square();
        Triangle t = new Triangle();
        Circle c = new Circle();
        Shape shape0 = (Shape) s; // 정사각형을 도형으로 해석(업 캐스팅)
        Shape shape1 = (Shape) t; // 삼각형을 도형으로 해석(업 캐스팅)
        Shape shape2 = (Shape) c; // 원을 도형으로 해석(업 캐스팅)

        Shape[] shapeArr = { new Square(), new Triangle(), new Circle() };
        ArrayList<Shape> shapeList = new ArrayList<Shape>();
        shapeList.add(new Square());
        shapeList.add(new Triangle());
        shapeList.add(new Circle());

        Shape shape = new Square(); // OK! 정사각형은 도형이다(O)
        //Square square = (Square) new Shape(); // ERROR! 도형은 정사각형이다(X)

        // 2 메소드 오버라이딩
        Archer a = new Archer();
        Archer ma = (Archer) new MasterArcher(); // MasterArcher 객체를 업 캐스팅
        a.shoot();
        ma.shoot();
    }
}

// 1 상속과 업 캐스팅
// - 부모 클래스
class Shape {
}

// - 자식 클래스
class Square extends Shape {
}

class Triangle extends Shape {
}

class Circle extends Shape {
}

// 2 메소드 오버라이딩
class Archer { // 일반 궁수
    void shoot( ) {
        System.out.println("[아처]의 활 공격이 10만큼의 피해를 주었습니다.");
    }
}
class MasterArcher extends Archer {
    void shoot() {
        System.out.println("[마스터 아처]의 활 공격이 30의 피해를 주었습니다.");
    }
}