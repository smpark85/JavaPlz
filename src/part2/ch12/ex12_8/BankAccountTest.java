package part2.ch12.ex12_8;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount a = new BankAccount("빌 게이츠", "206-000001", 1000000);
        BankAccount b = new BankAccount("워런 버핏", "206-000002", 1000000);
        System.out.println(a.toString());
        System.out.println(b.toString());
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