package lib;

public class IntegerItem extends Item<Integer> {

    public IntegerItem(Integer value) {
        super(value);
    }

    @Override
    public String toString() {
        return "IntegerItem = " + String.valueOf(getValue());
    }
}
