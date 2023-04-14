package study.step3;


import java.util.ArrayList;
import java.util.List;

public class Track {
    private int finish;
    private List<Car> cars = new ArrayList<>();

    Track(int carCount, int finish) {
        this.finish = finish;
        for (int i = 0; i < carCount; i++) {
            cars.add(new Car());
        }
    }

    public void startRacing() {
        for (Car car : cars) {
            car.move();
        }
    }

    public Boolean isRaceEnd() {
        int lastCarNumber = cars.size() - 1;
        return isFinish(cars.get(lastCarNumber).getAttemptCount());
    }

    public List<Car> getCars() {
        return cars;
    }

    private boolean isFinish(int carAttemptCount) {
        return finish == carAttemptCount;
    }

}
