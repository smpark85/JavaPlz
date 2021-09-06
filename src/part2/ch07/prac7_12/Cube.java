package part2.ch07.prac7_12;

public class Cube {
    int length;

    double getVolume() {
        return length * length * length;
    }

    double getSurfaceArea() {
        double squareArea = length * length;
        return 6 * squareArea;
    }

    public static void main(String[] args) {
        // 객체 생성
        Cube cube = new Cube();
        // 속성값 입력
        cube.length = 5;
        // 출력
        System.out.printf("한 변의 길이가 %d인\n", cube.length);
        System.out.printf("\t정육면체의 부피: %.2f\n", cube.getVolume());
        System.out.printf("\t정육면체의 겉넓이: %.2f\n", cube.getSurfaceArea());
    }
}
