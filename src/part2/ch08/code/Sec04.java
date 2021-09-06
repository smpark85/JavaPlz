package part2.ch08.code;

public class Sec04 {
    public static void main(String[] args) {
        // 2 private과 public
        Account acc = new Account();
        acc.balance = 1000000; // 객체의 정보가 임의로 변경됨(private 필드는 변경 불가)

        // - 게터 메소드
        //System.out.println("balance: " + acc.balance); // ERROR
        System.out.println("balance: " + acc.getBalance()); // balance: 0

        // - 세터 메소드
        //acc.balance = 1000; // ERROR
        acc.setBalance(1000);
    }
}

// 2 private과 public
class Account {
    int balance; // 잔액
    //private int getBalance;

    // - 게터 메소드
    public int getBalance() {
        return balance; // 잔액 반환 메소드
    }

    // - 세터 메소드
    public void setBalance(int b) {
        balance = b;
    }
}