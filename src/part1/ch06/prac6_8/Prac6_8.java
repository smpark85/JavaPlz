package part1.ch06.prac6_8;

public class Prac6_8 {
    public static void main(String[] args) {
        int[] numbers = {65, 74, 23, 75, 68, 96, 88, 98, 54};
        int secondTopIdx = getSecondTopIdx(numbers);
        System.out.println("배열: [65, 74, 23, 75, 68, 96, 88, 98, 54]");
        System.out.printf("두 번째로 큰 수: %d", numbers[secondTopIdx]);
    }

    public static int getSecondTopIdx(int[] arr) {
        int secondIdx = 0;
        int topIdx = getTopIndex(arr);

        for (int i = 0; i < arr.length; i++) {
            if (i == topIdx) {
                continue;
            }
            if (arr[i] > arr[secondIdx]) {
                secondIdx = i;
            }
        }
        return secondIdx;
    }

    public static int getTopIndex(int[] arr) {
        int topIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[topIdx]) {
                topIdx = i;
            }
        }
        return topIdx;
    }
}
