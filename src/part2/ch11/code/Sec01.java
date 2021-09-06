package part2.ch11.code;

public class Sec01 {
    public static void main(String[] args) {
        Alarm a = (Alarm) new SmartPhone(); // 스마트폰 객체를 알람 인터페이스로 해석
        a.playMusic("상어송"); // 메소드 오버라이딩
        a.beep();
    }
}

// 2 인터페이스 사용 예
interface Alarm {// Alarm 인터페이스의 정의
    // 추상 메소드, 메소드의 중괄호가 없음
    abstract public void playMusic(String title);
    abstract public void beep();
}

// Alarm 인터페이스를 구현한 SmartPhone 클래스
class SmartPhone implements Alarm {
    private String phoneNumber;

    public void playMusic(String title) {
        System.out.printf("[%s]이 재생됩니다..\n", title);
    }

    public void beep() {
        System.out.println("[비프음]이 재생됩니다. 삐빕~ 삐비비빕! (x10)");
    }
}