package part2.ch08.prac8_6;

public class FoodTest {
    public static void main(String[] args) {
        Food chicken = new Food("치킨", 19800);
        Food pizza = new Food("피자", 29700);
        System.out.printf("Food { name: %s, price: %d원 }\n",
                chicken.getName(), chicken.getPrice());
        System.out.printf("Food { name: %s, price: %d원 }\n",
                pizza.getName(), pizza.getPrice());
    }
}

class Food {
    String name;
    int price;

    Food(String s, int i) {
        name = s;
        price = i;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}