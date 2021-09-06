package part1.ch06.code;

public class Sec04 {
    public static void main(String[] args) {
        // 1 이차원 배열
        int[] row1 = {1, 2, 3, 4};
        int[] row2 = {5, 6, 7, 8};
        int[][] matrix = {row1, row2};

        // 2 삼차원 배열
        int[][][] cube = {
                {
                        {1, 2, 3, 4} ,
                        {5, 6, 7, 8}
                } ,
                {
                        {9, 10, 11, 12} ,
                        {13, 14, 15, 16}
                }
        };

        // Quiz4
        System.out.println(cube[0][0][0]);
        System.out.println(cube[1][1][0]);
        System.out.println(cube[0][1][3]);
        System.out.println(cube[0][0][0] + cube[1][1][0] + cube[0][1][3]);
    }
}
