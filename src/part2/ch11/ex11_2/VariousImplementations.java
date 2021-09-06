package part2.ch11.ex11_2;

public class VariousImplementations {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.playMusic("상어송");
        sp.call("010-1234-5678");
        sp.sendMsg("010-1234-5678", "자니?");
    }
}

interface Alarm {
    void playMusic(String title);

    void beep();
}

interface Phone {
    void call(String phoneNum);

    void receive();
}

interface Messenger {
    void sendMsg(String phoneNum, String msg);

    void receiveMsg();
}

class SmartPhone implements Alarm, Phone, Messenger {
    private String phoneNumber;

    public void playMusic(String title) {
        System.out.printf("[%s]이 재생됩니다..\n", title);
    }

    public void beep() {
        System.out.println("[비프음]이 재생됩니다. 삐빕~ 삐비비빕! (x10)");
    }

    public void call(String phoneNum) {
        System.out.printf("[%s]로 전화를 겁니다..rrrr\n", phoneNum);
    }

    public void receive() {
        System.out.println("전화를 받습니다. ");
    }

    public void sendMsg(String phoneNum, String msg) {
        System.out.printf("[%s]로 메시지 전송: %s\n", phoneNum, msg);
    }

    public void receiveMsg() {
        System.out.println("메시지가 도착하였습니다.");
    }
}