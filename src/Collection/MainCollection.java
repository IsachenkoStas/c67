package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class MainCollection extends ArrayList {
    public static void main(String[] args) {
        //Динамический массив
        // может хранить дубликаты
        // Хранят элементы в порядке добавления
        // время доступа к эдементу 0(1) - очень быстро
//        ArrayList<String> list = new ArrayList<>();
//        list.add("hello");
//        list.add("fgdfgdfg");
//        list.add("asdasdasd");
//        list.add("dasdqweo");
//        list.add("777");
//        list.add("777");
//        System.out.println(list.get(3));
//        System.out.println(list.size());
//        System.out.println(list.set(1, "new element")); //замена элемента
//        System.out.println(list.contains("hello")); // содержит ли что-то
//        System.out.println(list.indexOf("hello"));
//        System.out.println(list.isEmpty());
//        System.out.println(list.remove("777")); // первый который встретит, возвращает булевое значение
//        String[] arr = list.toArray(new String[0]);
        //      System.out.println(list.addAll());
        //        ArrayList<String> countries1 = (ArrayList<String>) Arrays.asList("1", "2");
        ArrayList<String> countries = new ArrayList<>() {{
            add("china");
            add("russia");
            add("uasfdsf");
            add("udsfgdhgf");
            add("troyortyr");
            add("khk");
            add("lkl");
            add("bnb");
            add("tyt");
        }};

     //   LinkedList<Integer> linkedList =
        Iterator countriesIterator = countries.iterator();
        while (countriesIterator.hasNext()){
            System.out.println(countriesIterator.next());
        }
        countries.forEach(System.out::println);
//        countries.set(2, "germany");
//        countries.remove(2);
//        countries.remove("china");
//        countries.indexOf("usa");
//        countries.contains("russia");
//        System.out.println(countries);

    }
}
