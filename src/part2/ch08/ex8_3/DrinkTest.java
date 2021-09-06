package part2.ch08.ex8_3;

public class DrinkTest {
    public static void main(String[] args) {
        Drink d1 = new Drink();
        Drink d2 = new Drink("박카스", 800);
    }
}

class Drink {
    String name;
    int price;

    Drink(String n, int p) {
        name = n;
        price = p;
    }

    Drink() {
        name = "이름 없음";
        price = 0;
    }
}