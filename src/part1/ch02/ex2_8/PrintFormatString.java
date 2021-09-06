package part1.ch02.ex2_8;

public class PrintFormatString {
    public static void main(String[] args) {
        String item = "라면";
        int price = 800;
        double weight = 0.12;
        boolean discounted = false;
        System.out.printf("상품-%s 가격-%d원 무게-%fkg 할인여부-%b", item, price, weight, discounted);
    }
}
