package part1.ch03.prac3_7;

public class WhatIsWrong {
    public static void main(String[] args) {
        int a = square((int) 3.0); // double => (int)
        int b = (int) cube(2); // double => (int)
        System.out.printf("a = %d, b = %d", a, b);
    }

    public static int square(int n) {
        return n * n;
    }

    public static double cube(double n) {
        return n * n * n;
    }
}
