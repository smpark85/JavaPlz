package part1.ch04.prac4_6;

public class ProgrammingGrades {
    public static void main(String[] args) {
        printGrade(96);
        printGrade(85);
        printGrade(76);
    }

    public static void printGrade(int score) {
        String grade = "";

        if (score >= 95) {
            grade = "A+";
        } else if (score >= 90) {
            grade = "A0";
        } else if (score >= 80) {
            grade = "B+";
        } else {
            grade = "C+";
        }
        System.out.printf("%d점 -> %s\n", score, grade);
    }
}