package part2.ch10.ex10_10;

public class MoreKeywords {
    public static void main(String[] args) {
        Item item1 = new Item("마법사의 지팡이", 1000);
        System.out.printf("[%s](%d 골드) 생성 완료\n", item1.name, item1.price);
    }
}

class Item {
    String name;
    int price;

    Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
}