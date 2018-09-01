package lib;

public class Item<T> {
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    private T value;

    public Item(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Item = " + String.valueOf(value);
    }
}
