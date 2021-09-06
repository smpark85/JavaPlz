package part2.ch09.prac9_4;

import java.util.StringTokenizer;

public class StringTokenizerTest {
    public static void main(String[] args) {
        String str1 = "야식이 생각나는 밤, 나는 그렇게 치킨을 시켰다. 그렇다.."
                + "치킨은 항상 옳다.";
        StringTokenizer st1 = new StringTokenizer(str1, ".");
        while (st1.hasMoreTokens()) {
            System.out.println(st1.nextToken());
        }
        String str2 = "치킨,피자,족발,보쌈,etc.";
        StringTokenizer st2 = new StringTokenizer(str2, ".");
        while (st2.hasMoreTokens()) {
            System.out.println(st2.nextToken());
        }
    }
}
