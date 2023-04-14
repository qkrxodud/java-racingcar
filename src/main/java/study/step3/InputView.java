package study.step3;

import java.util.Scanner;

public class InputView {
    public static Scanner scanner = new Scanner(System.in);

    private InputView() {
        // 생성자 내부 호출 -> 명시적 Exception
        throw new AssertionError();
    }

    public static int askCarCount() {
        System.out.println("자동차 대수는 몇 대 인가요?\n");
        return scanner.nextInt();
    }

    public static int aksFinishCount() {
        System.out.println("마지막 바퀴는 몇바퀴 인가요?\n");
        return scanner.nextInt();
    }
}
