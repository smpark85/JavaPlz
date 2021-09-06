package part2.ch10.code;

public class Sec05 {
    public static void main(String[] args) {
        // 생성자 호출을 통한 Item 객체 만들기
        Item item1 = new Item("마법사의 지팡이", 1000);
    }
}

class Item { // Item 클래스 예
    String name; // 이름
    int price; // 가격
    Item(String _name, int _price) {
        name = _name;
        price = _price;
    }
}
