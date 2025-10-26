package racingcar;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String carName = Console.readLine();

        String[] names = carName.split(",");
        List<Car> cars = new ArrayList<>();
        for(int i=0; i<names.length; i++) {
            String name = names[i].trim();
            cars.add(new Car(name));
        }

        System.out.println("시도할 횟수는 몇 회인가요?");
        int attempt = Integer.parseInt(Console.readLine());

        System.out.println();
        System.out.println("실행 결과");

        RacingGame game = new RacingGame(cars, attempt);
        game.run();
        List<String> winners = game.getWinners();

        System.out.println("최종 우승자 : " + String.join(", ", winners));
    }
}
