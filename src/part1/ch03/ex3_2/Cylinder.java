package part1.ch03.ex3_2;

public class Cylinder {
    public static void main(String[] args) {
        double r = 7;
        double h = 5;
        double v = volume(r, h);

        System.out.printf("반지름이 %.1f, 높이가 %.1f인 원기둥의 부피: %.1f", r, h, v);
    }

    // 반지름의 길이와 높이를 입력받아, 원기둥의 부피를 반환하는 메소드
    public static double volume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }
}