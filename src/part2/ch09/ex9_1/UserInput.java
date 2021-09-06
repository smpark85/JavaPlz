package part2.ch09.ex9_1;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("이름: ");
        String name = input.next();
        System.out.print("학번: ");
        int number = input.nextInt();
        System.out.print("학점: ");
        double grade = input.nextDouble();
        System.out.printf("[%s]님의 학번은 %d이며, 학점은 %.2f 입니다.",
                name, number, grade);
    }
}