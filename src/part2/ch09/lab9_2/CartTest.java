package part2.ch09.lab9_2;

import java.util.ArrayList; // ArrayList 클래스 API를 불러옴

public class CartTest {
    public static void main(String[] args) {
        // Item 객체 생성
        Item shirt = new Item("스트라이프 셔츠", 49900);
        Item pants = new Item("슬림 면바지", 58900);
        Item sneakers = new Item("스니커즈", 46900);

        // ArrayList 객체 생성 및 Item 담기
        ArrayList<Item> cart = new ArrayList<Item>();
        cart.add(shirt);
        cart.add(pants);
        cart.add(sneakers);

        int sum = 0;
        for (int i = 0; i < cart.size(); i++) {
            Item item = cart.get(i);
            System.out.println(item.toStr());
            sum += item.getPrice();
        }
        System.out.println("===========================");
        System.out.printf("총합: %d원", sum);
    }
}

class Item {
    private String name;
    private int price;

    public Item(String _name, int _price) {
        name = _name;
        price = _price;
    }

    public String toStr() {
        return String.format("Item { name: %s, price: %d }", name, price);
    }

    public int getPrice() {
        return price;
    }
}