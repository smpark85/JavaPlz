package part2.ch12.ex12_9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BankAccountTest {
    public static void main(String[] args) throws IOException {
        BankAccount a = new BankAccount("빌 게이츠", "206-000001", 1000000);
        BankAccount b = new BankAccount("워런 버핏", "206-000002", 1000000);
        File file = new File("accounts-data.txt");
        FileWriter fw = new FileWriter(file);
        fw.write(a.toString() + "\n");
        fw.write(b.toString() + "\n");
        fw.close();
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