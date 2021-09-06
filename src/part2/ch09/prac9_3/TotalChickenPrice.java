package part2.ch09.prac9_3;

import java.util.ArrayList;

public class TotalChickenPrice {
    public static void main(String[] args) {
        ArrayList<OrderItem> order = new ArrayList<OrderItem>();
        order.add(new OrderItem("후라이드 치킨", 9900, 3));
        order.add(new OrderItem("양념 치킨", 10900, 2));
        order.add(new OrderItem("간장 치킨", 11900, 2));

        int sum = 0;
        for (int i = 0; i < order.size(); i++) {
            OrderItem orderItem = order.get(i);
            System.out.println(orderItem.toStr());
            sum += orderItem.totalPrice();
        }
        System.out.println("===================");
        System.out.printf("총합: %d원", sum);
    }
}

class OrderItem {
    private String name;
    private int price;
    private int count;

    public OrderItem(String s, int p, int c) {
        name = s;
        price = p;
        count = c;
    }

    public String toStr() {
        return String.format("%s(%d원) x %d마리", name, price, count);
    }

    public int totalPrice() {
        return price * count;
    }
}