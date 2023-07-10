package HomaTask18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainStream {
    public static void main(String[] args) {
        // Task 3
/*        ArrayList<Developer> developers = new ArrayList<>();
        developers.add(new Developer("Antonio", 15));
        developers.add(new Developer("Jack", 12));
        developers.add(new Developer("John", 5));
        developers.add(new Developer("Andrey", 9));
        developers.add(new Developer("Ananas", 11));

        developers.stream()
                .filter(developer -> developer.getId() > 10)
                .filter(developer -> developer.getName().startsWith("An"))
                .forEach(System.out::println);*/

        //Task 1
//        ArrayList<Integer> numList = new ArrayList<>(){{
//            add((int) (Math.random() * 10));
//            add((int) (Math.random() * 10));
//            add((int) (Math.random() * 10));
//            add((int) (Math.random() * 10));
//            add((int) (Math.random() * 10));
//            add((int) (Math.random() * 10));
//            add((int) (Math.random() * 10));
//            add((int) (Math.random() * 10));
//        }};
//        System.out.println(numList);
//        System.out.println(numList.stream().distinct().filter(num -> num % 2 == 0).reduce(Integer::sum));

        // Task 2
        HashMap<Integer, String> idNameMap = new HashMap<>() {{
            put(1, "Antonio");
            put(2, "Banderas");
            put(3, "Will");
            put(7, "Smith");
            put(9, "Jason");
            put(13, "Statham");
        }};
        List<String> list = idNameMap.entrySet().stream()
                .filter(key -> key.getKey().toString().matches("([12589])|13"))
                .map(Map.Entry::getValue)
                .filter(value -> value.length() % 2 == 1)
                .map(s -> new StringBuilder(s).reverse().toString())
                .toList();
        System.out.println(list);
    }
}
