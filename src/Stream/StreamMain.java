package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
//        // create
//        Stream.of(1, 2, 3, 4, 5);
//
//        ArrayList<String> list = new ArrayList<>();
//        list.stream();
//
//        int[] arr = {10, 20, 30, 40, 50};
//        Arrays.stream(arr);
        List<String> res = Stream.of(10, 20, 30, 40, 50, 95, 85, 80, 90, 100)

                // конвейерные
                .filter(num -> num > 25)
                .skip(2)
                .distinct() // убирает дубликаты
                .peek(p -> Math.sqrt(p))
                .map(n -> n + " $$$") //преобраазует
                .limit(3) //пропускает n элементов дальше
                .sorted()
                .flatMap(p -> Arrays.stream(p.split(" ")))

                //терминальные
                .collect(Collectors.toList());
                // .forEach(System.out::println);
                // .findFirst();
                // .findAny()
                // .collect(Collectors.toSet());
                // .count(); Возвращает количество элементов в стриме
                // .anyMatch(a -> a.equals("$$$"));
                // .min(Integer::compare);
                // .max(Integer::compare);
                // .toArray(String[]::new);
                // .reduce((a,b) -> a + "_000_" + b);
        System.out.println(res);
    }
}
