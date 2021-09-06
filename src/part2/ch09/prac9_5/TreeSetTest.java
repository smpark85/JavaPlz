package part2.ch09.prac9_5;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.add(1);
        ts.add(7);
        ts.add(3);
        ts.add(4);
        ts.add(2);
        System.out.printf("ts.size(): %d\n", ts.size());
        System.out.printf("ts.first(): %d\n", ts.first());
        System.out.printf("ts.last(): %d\n", ts.last());
        System.out.printf("ts.higher(5): %d\n", ts.higher(5));
        System.out.printf("ts.lower(3): %d\n", ts.lower(3));
    }
}
