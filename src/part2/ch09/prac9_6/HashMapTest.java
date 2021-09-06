package part2.ch09.prac9_6;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "하나,one,eins");
        hm.put(2, "둘,two,zwei");
        hm.put(3, "셋,three,drei");
        String str1 = hm.get(1);
        String str2 = hm.get(2);
        String str3 = hm.get(3);
        String[] arr1 = str1.split(",");
        String[] arr2 = str2.split(",");
        String[] arr3 = str3.split(",");
        System.out.printf("1 - %s(한국어), %s(영어), %s(독일어)\n", arr1[0],
                arr1[1], arr1[2]);
        System.out.printf("2 - %s(한국어), %s(영어), %s(독일어)\n", arr2[0],
                arr2[1], arr2[2]);
        System.out.printf("3 - %s(한국어), %s(영어), %s(독일어)\n", arr3[0],
                arr3[1], arr3[2]);
    }
}
