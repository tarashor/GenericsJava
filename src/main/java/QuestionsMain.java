import java.util.List;

public class QuestionsMain {
    public static void print(List<? extends Number> list) {
        for (Number n : list)
            System.out.print(n + " ");
        System.out.println();
    }

    static class Shape { /* ... */ }
    static class Circle extends Shape { /* ... */ }
    static class Rectangle extends Shape { /* ... */ }

    static class Node<T>  implements Comparable<T> {
        public int compareTo(T obj) { return 0; }
    }

    public static void main(String[] args) {
//        Node<Circle> nc = new Node<>();
//        Node<Shape> ns = nc;

        Node<String> node = new Node<>();
        Comparable<String> comp = node;
    }
}
