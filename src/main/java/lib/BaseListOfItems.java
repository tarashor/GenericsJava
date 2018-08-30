package lib;

import java.util.ArrayList;
import java.util.List;

public class BaseListOfItems<T extends Item<?>> {
    public BaseListOfItems() {
        this.items = new ArrayList<>();
    }

    public List<T> getItems() {
        return items;
    }

    private final List<T> items;


    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (Item<?> item : items){
            res.append(item.toString());
            res.append(" ");
        }
        return getClass().getName() + " = " + res;
    }
}
