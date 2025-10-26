package racingcar;

import java.util.List;

public class RacingGame {
    private final List<Car> cars;
    private final int attempt;

    public RacingGame(List<Car> cars, int attempt) {
        this.cars = cars;
        this.attempt = attempt;
    }

    public void run() {

    }

    public void moveCar() {

    }

    public List<String> getWinners() {
        return List.of();
    }
}
