package part1.ch06.ex6_7;

public class Ex6_7 {
    public static void main(String[] args) {
        String str = "Programming is fun! Right?";
        char[] charArr = str.toCharArray();
        int count = 0;

        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == 'R' || charArr[i] == 'r') {
                count++;
            }
        }
        System.out.println(str);
        System.out.printf("=> R(r)의 개수: %d", count);
    }
}
