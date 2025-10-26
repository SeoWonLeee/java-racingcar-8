package racingcar;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("입력된 자동차 이름이 없습니다.");
        if (name.contains(" ")) throw new IllegalArgumentException("자동차 이름에 공백은 허용되지 않습니다.");
        if (name.length() > 5) throw new IllegalArgumentException("자동차 이름은 5자 이하여야 합니다.");
        this.name = name;
    }

    public void move() {
        if(RandomMove.canMove()) {
            position++;
        }
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " : " + "-".repeat(position);
    }
}
