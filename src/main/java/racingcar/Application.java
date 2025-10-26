package racingcar;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String carName = Console.readLine();

        String[] names = carName.split(",");
        List<Car> cars = new ArrayList<>();
        Set<String> dup = new HashSet<>();

        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            if (!dup.add(name)) {
                throw new IllegalArgumentException("중복된 자동차 이름이 있습니다.");
            }
            cars.add(new Car(name));
        }

        System.out.println("시도할 횟수는 몇 회인가요?");
        String attemptStr = Console.readLine();

        int attempt;
        try {
            attempt = Integer.parseInt(attemptStr);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도 횟수는 정수여야 합니다.");
        }
        if (attempt <= 0) {
            throw new IllegalArgumentException("시도 횟수는 1 이상이어야 합니다.");
        }

        System.out.println();
        System.out.println("실행 결과");

        RacingGame game = new RacingGame(cars, attempt);
        game.run();
        List<String> winners = game.getWinners();

        System.out.println("최종 우승자 : " + String.join(", ", winners));
    }
}
