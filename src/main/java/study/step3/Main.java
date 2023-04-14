package study.step3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력 화면
        Scanner scanner = InputView.scanner;
        int carCount = InputView.askCarCount();
        InputView.aksFinishCount();
        int finish = scanner.nextInt();

        //레이싱 경기장
        Track track = new Track(carCount, finish);
        while (!track.isRaceEnd()) {
            track.startRacing();
            ResultView.outPut(track);
        }
    }
}
