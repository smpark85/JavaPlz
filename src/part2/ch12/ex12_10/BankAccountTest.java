package part2.ch12.ex12_10;

import java.io.*; // File, FileReader, IOException 클래스 등을 불러옴

public class BankAccountTest {
    public static void main(String[] args) throws IOException,
            InterruptedException {
        File file = new File("accounts-data.txt");
        FileReader fr = new FileReader(file);
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
            // Thread.sleep(200);
        }
        fr.close();
    }
}

class BankAccount {
    private final String username; // 고객명
    private final String number; // 계좌번호
    private int amount; // 잔액

    public BankAccount(String username, String number, int amount) {
        this.username = username;
        this.number = number;
        this.amount = amount;
    }

    public String toString() {
        return String.format("%s, %s, %d", username, number, amount);
    }
}