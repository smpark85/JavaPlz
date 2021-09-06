package part2.ch09.lab9_3;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections; // ArrayList를 무작위로 섞기 위해 불러옴

public class SimpleLotto {
    public static void main(String[] args) {
        ArrayList<Integer> lottoMachine = new ArrayList<Integer>();
        for (int i = 1; i <= 45; i++) {
            lottoMachine.add(i); // 모든 로또 번호(1~45)를 ArrayList에 추가
        }
        Collections.shuffle(lottoMachine);
        int[] lottoNumArr = new int[6];
        for (int i = 0; i < lottoNumArr.length; i++) {
            lottoNumArr[i] = lottoMachine.remove(0);
        }
        String lottoNumStr = Arrays.toString(lottoNumArr);
        System.out.printf("자동 생성 로또 번호: %s", lottoNumStr);
    }
}