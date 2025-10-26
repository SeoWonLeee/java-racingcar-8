package racingcar;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private final List<Car> cars;
    private final int attempt;

    public RacingGame(List<Car> cars, int attempt) {
        this.cars = cars;
        this.attempt = attempt;
    }

    public void run() {
        for(int i=0; i<attempt; i++) {
            moveCar();
            printRoundResult();
        }
    }

    public void printRoundResult() {
        for(int i=0; i<cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println();
    }

    public void moveCar() {
        for(int i=0; i<cars.size(); i++) {
            cars.get(i).move();
        }
    }

    public List<String> getWinners() {
        int maxPosition = 0;
        for(int i=0; i<cars.size(); i++) {
            int position = cars.get(i).getPosition();
            if(position > maxPosition) {
                maxPosition = position;
            }
        }

        List<String> winners = new ArrayList<>();
        for(int i=0; i<cars.size(); i++) {
            if(cars.get(i).getPosition() == maxPosition) {
                winners.add(cars.get(i).getName());
            }
        }

        return winners;
    }
}
