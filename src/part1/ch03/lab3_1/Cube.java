package part1.ch03.lab3_1;

public class Cube {
    public static void main(String[] args) {
        int n = 3;
        int v = volume(n);
        System.out.printf("한 변의 길이가 %d인 정육면체의 부피: %d ", n, v);
    }

    public static int volume(int length) {
        return length * length * length;
    }
}