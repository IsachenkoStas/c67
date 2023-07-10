package Collection;

import java.util.ArrayDeque;

public class Queue {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("g");
        deque.add("b");
        deque.add("s");
        deque.removeLast();
        System.out.println(deque);
    }
}
