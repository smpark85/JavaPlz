package part1.ch06.ex6_2;

public class Ex6_2 {
    public static void main(String[] args) {
        int[] sales = new int[5]; // 판매량 기록을 위한 배열

        sales[0] = 52; // 월
        sales[1] = 50; // 화
        sales[2] = 55; // 수
        sales[3] = 42; // 목
        sales[4] = 38; // 금

        int sum = sales[0] + sales[1] + sales[2] + sales[3] + sales[4];
        System.out.printf("총 판매량: %d잔", sum);
    }
}
