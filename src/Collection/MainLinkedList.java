package Collection;

import java.util.LinkedList;
import java.util.List;

public class MainLinkedList {
    public static void main(String[] args) {
        // Двусвязные списки
        // Хранят элементы в порядке добавления
        LinkedList<String> list = new LinkedList<>(){{
            addFirst("china");
            addFirst("russia");
            addLast("usa");
            addLast("germany");
        }};
        list.removeFirst();
        list.removeLast();
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list);
        // addFirst, addLast
//        list.peek();
//        list.poll();
//        list.pop();
    }
}