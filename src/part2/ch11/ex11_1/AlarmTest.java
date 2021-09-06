package part2.ch11.ex11_1;

public class AlarmTest {
    public static void main(String[] args) {
        Alarm a = new SmartPhone();
        a.playMusic("상어송");
        a.beep();
    }
}

interface Alarm {
    void playMusic(String title);

    void beep();
}

class SmartPhone implements Alarm {
    private String phoneNumber;

    public void playMusic(String title) {
        System.out.printf("[%s]이 재생됩니다..\n", title);
    }

    public void beep() {
        System.out.println("[비프음]이 재생됩니다. 삐빕~ 삐비비빕! (x10)");
    }
}