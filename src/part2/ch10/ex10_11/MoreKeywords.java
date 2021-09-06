package part2.ch10.ex10_11;

public class MoreKeywords {
    public static void main(String[] args) {
        Item item2 = new Item();
        System.out.printf("[%s](%d 골드) 생성 완료\n", item2.name, item2.price);
    }
}

class Item {
    String name;
    int price;

    Item(String name, int price) { // 입력변수가 String, int인 생성자
        this.name = name;
        this.price = price;
    }

    Item() { // 입력변수가 없는 생성자
        this("이름 없음", -1);
    }
}