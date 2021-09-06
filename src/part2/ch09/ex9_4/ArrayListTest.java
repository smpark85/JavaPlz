package part2.ch09.ex9_4;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Kim");
        names.add("Lee");
        names.add("Park");
        names.add("Choi");
        names.set(0, "Han");
        String removed = names.remove(1);
        for (int i = 0; i < names.size(); i++) {
            System.out.printf("%s ", names.get(i));
        }
    }
}