package part2.ch12.lab12_1;

import java.util.Scanner;

public class QuizTest {
    public static void main(String[] args) {
        Quiz myQuiz = new Quiz("다음 중 과일이 아닌 것은? 1: 사과 2: 젤리", 2);
        String result = "퀴즈가 정상 수행되지 않았습니다.";
        try {
            result = myQuiz.play() ? "정답입니다" : "오답입니다";
        } catch (QuizException ex) {
            System.out.printf("예외 발생! %s\n", ex.getMessage());
        } catch (NumberFormatException ex) {
            System.out.printf("예외 발생! %s\n", ex.getMessage());
        } finally {
            System.out.println(result);
        }
    }
}

class Quiz {
    private String question;
    private int answer;
    private static final Scanner scanner = new Scanner(System.in);

    public Quiz(String question, int answer) {
        this.question = question;
        this.answer = answer;
    }

    public boolean play() throws QuizException {
        System.out.println(question);
        System.out.print("정답을 입력하시오: ");
        String inputStr = scanner.next();
        int inputNum = Integer.parseInt(inputStr);
        if (!(inputNum == 1 || inputNum == 2)) {
            throw new QuizException("보기에 없는 값을 입력하였습니다.");
        }
        return (answer == inputNum) ? true : false;
    }
}

class QuizException extends Exception { // 사용자 정의 예외
    public QuizException(String message) {
        super(message);
    }
}