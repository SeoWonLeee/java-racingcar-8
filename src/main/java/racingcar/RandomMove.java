package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomMove {
    public static boolean canMove() {
        return Randoms.pickNumberInRange(0, 9) >= 4;
    }
}
