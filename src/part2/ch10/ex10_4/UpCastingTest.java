package part2.ch10.ex10_4;

public class UpCastingTest {
    public static void main(String[] args) {
        Square s = new Square();
        s.name = "정사각형";
        Triangle t = new Triangle();
        t.name = "삼각형";
        Circle c = new Circle();
        c.name = "원";
        Shape[] shapes = {s, t, c};
        for (int i = 0; i < shapes.length; i++) {
            System.out.printf("%d번 인덱스의 도형: %s\n", i, shapes[i].name);
        }
    }
}

// 부모 클래스
class Shape { // 도형
    String name;
}

// 자식 클래스
class Square extends Shape {} // 정사각형

class Triangle extends Shape {} // 삼각형

class Circle extends Shape {} // 원