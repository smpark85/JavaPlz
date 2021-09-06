package part2.ch08.ex8_8;

public class AccountTest {
    public static void main(String[] args) {
        Account acc = new Account();
        // acc.balance = 1000; // ERROR
        acc.setBalance(1000);
        System.out.printf("잔액: %d", acc.getBalance());
    }
}

class Account {
    private int balance; // 잔액, private 적용

    // 게터 메소드
    public int getBalance() {
        return balance;
    }

    // 세터 메소드
    public void setBalance(int b) {
        balance = b;
    }
}
