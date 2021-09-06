package part2.ch07.prac7_11;

public class Cylinder {
    int radius;
    int height;

    double getVolume() {
        return radius * radius * Math.PI * height;
    }

    double getSurfaceArea() {
        double circleArea = Math.PI * radius * radius;
        double rectangleArea = height * 2 * Math.PI * radius;
        return 2 * circleArea + rectangleArea;
    }

    public static void main(String[] args) {
        // 객체 생성
        Cylinder c = new Cylinder();
        // 속성값 입력
        c.radius = 4;
        c.height = 5;
        // 출력
        System.out.printf("원기둥의 부피: %.2f\n", c.getVolume());
        System.out.printf("원기둥의 겉넓이: %.2f\n", c.getSurfaceArea());
    }
}