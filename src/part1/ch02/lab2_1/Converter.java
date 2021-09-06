package part1.ch02.lab2_1;

public class Converter {
    public static void main(String[] args) {
        double fahrenheit = 77.0;
        double celsius = (fahrenheit - 32.0) / 1.8;
        System.out.printf("화씨 %.1f도는 섭씨로 %.1f도입니다.", fahrenheit, celsius);
    }
}
