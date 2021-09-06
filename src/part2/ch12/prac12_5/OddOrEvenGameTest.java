package part2.ch12.prac12_5;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class OddOrEvenGameTest {
    public static void main(String[] args) throws Exception {
        OddOrEvenGame game = new OddOrEvenGame();
        game.printRecord();
        game.play();
        game.saveRecord();
    }
}

class OddOrEvenGame {
    private Record record;
    private Random rand = new Random();
    private Scanner scanner = new Scanner(System.in);

    public void printRecord() throws IOException {
        System.out.println("== 프로그램을 시작합니다 ==");
        File file = new File("win-loss-record.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line = null;
        if ((line = br.readLine()) != null) {
            String[] temp = line.split(",");
            int win = Integer.parseInt(temp[0]);
            int loss = Integer.parseInt(temp[1]);
            record = new Record(win, loss);
            record.print();
        }
        br.close();
    }

    public void play() {
        System.out.println("\n== 게임을 진행합니다 ==");

        // 난수 생성
        int randGenNum = rand.nextInt(1000);
        System.out.printf("생성된 수: %dX\n", randGenNum / 10);

        // 사용자 입력
        System.out.printf("홀짝을 입력하세요(1: 홀 2: 짝): ");
        int inputNum = Integer.parseInt(scanner.next());

        // 입력값 확인
        String result = null;
        switch (inputNum) {
            case 1:
                System.out.printf("홀! ");
                break;
            case 2:
                System.out.printf("짝! ");
                break;
            default:
                result = "잘못된 입력입니다";
                return;
        }

        // 결과 판정
        if ((randGenNum % 2) == (inputNum % 2)) {
            result = "정답입니다";
            record.plusWin();
        } else {
            result = "오답입니다";
            record.plusLoss();
        }
        System.out.printf("%s(%d)\n", result, randGenNum);
    }

    public void saveRecord() throws IOException {
        System.out.println("\n== 승패 기록 ==");
        record.print();
        File file = new File("win-loss-record.txt");
        FileWriter fw = new FileWriter(file);
        fw.write(record.toFileString());
        fw.close();
    }
}

class Record {
    private int win;
    private int loss;

    public Record(int win, int loss) {
        this.win = win;
        this.loss = loss;
    }

    public void print() {
        System.out.printf("[전적] %d승 %d패\n", win, loss);
    }

    public void plusWin() {
        win++;
    }

    public void plusLoss() {
        loss++;
    }

    public String toFileString() {
        return String.format("%d,%d", win, loss);
    }
}