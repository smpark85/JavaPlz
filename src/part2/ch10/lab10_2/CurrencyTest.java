package part2.ch10.lab10_2;

public class CurrencyTest {
    public static void main(String[] args) {
        KRW won = new KRW(1500.00); // 1,500원
        USD dollar = new USD(100.50); // 100.50 달러
        EUR euro = new EUR(260.75); // 260.75 유로

        Currency[] currencyArr = {won, dollar, euro};
        for (int i = 0; i < currencyArr.length; i++) {
            currencyArr[i].printInfo();
        }
    }
}

abstract class Currency {
    protected double amount;

    public Currency(double amount) {
        this.amount = amount;
    }

    public void printInfo() { // 객체 정보 출력
        System.out.printf("해당 화폐는 %f만큼 있습니다.", amount);
    }
}

class KRW extends Currency {
    public KRW(double amount) {
        super(amount); // 부모 클래스 Currency의 생성자 호출
    }

    public void printInfo() { // 메소드 재정의(오버라이드)
        System.out.printf("KRW: %.2f 원\n", amount);
    }
}

class USD extends Currency {
    public USD(double amount) {
        super(amount); // 부모 클래스 Currency의 생성자 호출
    }

    public void printInfo() { // 메소드 재정의(오버라이드)
        System.out.printf("USD: %.2f 달러\n", amount);
    }
}

class EUR extends Currency {
    public EUR(double amount) {
        super(amount); // 부모 클래스 Currency의 생성자 호출
    }

    public void printInfo() { // 메소드 재정의(오버라이드)
        System.out.printf("EUR: %.2f 유로\n", amount);
    }
}