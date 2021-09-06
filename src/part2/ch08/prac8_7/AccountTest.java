package part2.ch08.prac8_7;

public class AccountTest {
    public static void main(String[] args) {
        Account a = new Account("123-45", 10000);
        Account b = new Account("567-89", 10000);
        while (a.transfer(b, 3000)) {
            ;
        }
        System.out.println(a.toStr());
        System.out.println(b.toStr());
    }
}

class Account {
    String num;
    int balance;

    public Account(String s, int i) {
        num = s;
        balance = i;
    }

    public boolean transfer(Account account, int amount) {
        if (balance < amount) {
            return false;
        }
        balance -= amount;
        account.balance += amount;
        return true;
    }

    public String toStr() {
        return String.format("Account { num: %s, balance: %d }", num, balance);
    }
}
