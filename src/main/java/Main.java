import lib.IntegerItem;
import lib.Item;
import lib.BaseListOfItems;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {


    public static void main(String[] args) {
//        Number[] numbers = new Integer[10];
//        numbers[0] = 20d;
//        List<Integer> integersList = new ArrayList<>();
//        List list = integersList;
//        List<Number> numbersList = list;
//        numbersList.add(20d);

        BaseListOfItems<Item<Number>> items = new BaseListOfItems<>();

        Item<Number> zero = new Item<Number>(Integer.valueOf(0));

        Item<String> ten = new Item<>("");
        Item<Integer> twenty = new Item<>(20);
        Item newTwenty = twenty;
        newTwenty.setValue("asdasdasd");

        IntegerItem thirty = new IntegerItem(30);

        items.getItems().add(zero);
//        items.getItems().add(ten);
//        items.getItems().add(twenty);
//        items.getItems().add(thirty);

        addItem(Integer.valueOf(40), items);

        System.out.print(items);

//        List<Item> baseItems = new ArrayList<>();
//        baseItems.addAll(items.getItems());
//        System.out.println(baseItems);
    }

    static <T> T pick(T a1, T a2) { return a2; }

    private static <V> void addItem(V v, BaseListOfItems<Item<V>> items) {
        items.getItems().add(new Item<V>(v));
    }

    static double sum(List<Item<? extends Number>> items) {
        double res = 0;
        for (Item<? extends Number> item : items){
            Number n = item.getValue();
            res += n.doubleValue();
        }
        return res;
    }



}
