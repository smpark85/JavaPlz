package part1.ch04.prac4_8;

public class Salary {
    public static void main(String[] args) {
        printSalary(10000, 160);
        printSalary(15000, 175);
        printSalary(9000, 180);
        printSalary(13000, 190);
    }

    // 시급과 일한 시간을 입력받아, 주급을 출력
    public static void printSalary(int wage, int hours) {
        // 최저 시급 체크
        if (wage < 10000) {
            System.out.println("[에러] 기본 시급이 1만 원보다 작습니다.");
            return;
        }
        // 초과 근무시간 체크
        if (hours > 180) {
            System.out.println("[에러] 근무시간이 180시간을 초과하였습니다.");
            return;
        }

        // 급여 변수
        double salary = 0.0;

        // 초과 급여 계산
        if (hours > 160) {
            int extraHours = hours - 160; // 초과 시간
            salary += wage * extraHours * 1.5; // 초과 급여
            hours -= extraHours;  // 초과 시간 제거
        }
        // 기본 급여 계산
        salary += wage * hours;
        // 결과 출력
        System.out.printf("[급여] %d 원\n", (int) salary);
    }
}
