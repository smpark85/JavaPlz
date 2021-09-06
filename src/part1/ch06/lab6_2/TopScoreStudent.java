package part1.ch06.lab6_2;

public class TopScoreStudent {
    public static void main(String[] args) {
        // 배열 생성
        String[] names = {"Elena", "Suzie", "John", "Emily", "Neda",
                "Kate", "Alex", "Daniel", "Sam"};
        int[] scores = {65, 74, 23, 75, 68, 96, 88, 98, 54};

        // 정수 배열 중 가장 큰 요소의 인덱스를 계산
        int i = topIndex(scores);

        // 결과 출력
        System.out.printf("1등: %s(%d점)", names[i], scores[i]);
    }

    public static int topIndex(int[] arr) {
        int topIdx = 0; // 가장 큰 값의 인덱스, 초깃값 0

        for (int i = 0; i < arr.length; i++) {
            if (arr[topIdx] < arr[i]) { // 현재 인덱스 i의 값이 가장 큰 값이라면,
                topIdx = i; // topIdx를 i로 변경
            }
        }
        return topIdx;
    }
}
