package part2.ch11.code;

import java.util.ArrayList;

public class Sec02 {
    public static void main(String[] args) {
        // 3 인터페이스의 다형성
        // 다양한 객체 생성
        Bird bird = new Bird();
        Helicopter copter = new Helicopter();
        Rocket rocket = new Rocket();
        // 상위 인터페이스 타입 배열에 저장된 객체들
        Flyable[] arr = {bird, copter, rocket};
        // 상위 인터페이스 타입 ArrayList에 담긴 객체들
        ArrayList<Flyable> list = new ArrayList<Flyable>();
        list.add(bird);
        list.add(copter);
        list.add(rocket);

        for (int i = 0; i < arr.length; i++) {
            arr[i].fly(); // 메소드 오버라이딩
        }
    }
}

interface Phone { // 인터페이스 Phone 정의
    void call(String phoneNum);

    void receive();
}

interface Messenger { // 인터페이스 Messenger정의
    void sendMsg(String phoneNum, String msg);

    void receiveMsg();
}

interface Flyable { // 공통 메소드를 추출하여 만든 인터페이스
    void fly(); // 추상 메소드로 추출된 공통 메소드
}

class Bird implements Flyable {
    public void fly() {
        System.out.println("[새]가 날개를 퍼덕이며 날아갑니다!");
    }
}

class Helicopter implements Flyable {
    public void fly() {
        System.out.println("[헬기]가 프로펠러를 돌리며 날아갑니다.");
    }
}

class Rocket implements Flyable {
    public void fly() {
        System.out.println("[로켓]이 불꽃을 뿜으며 날아갑니다!");
    }
}