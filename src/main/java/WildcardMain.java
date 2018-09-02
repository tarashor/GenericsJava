import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildcardMain {

    public static void main(String[] args){

        List<Integer> li = Arrays.asList(1,2,30,3,5);

        int m =  max(li);

        System.out.print(m);
    }

    public static <T extends Comparable<? super T>> T max(List<? extends T> list) {

        T maxElem = list.get(0);

        for (T element : list)
            if (maxElem.compareTo(element) < 0)
                maxElem = element;
        return maxElem;
    }
}
