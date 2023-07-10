package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        // key - все уникальные
        HashMap<String, Integer> map = new HashMap<>();
        map.put("First key", 100);// положить
        map.put("Second key", 100); // значения могут дублироваться, но ключи должны быть разные
        map.put("USD", 296);
        System.out.println(map);
        map.get("Second key");
        System.out.println(map.containsKey("First key"));
        System.out.println(map.containsValue(100));
        map.remove("USD", 296);
        System.out.println(map.keySet());
        //   Set<String> getAllKeys = map.keySet(); // достать все ключи в отдельную коллекцию
        //   Collection<Integer> getAllValues = map.values(); // достать все значения
        ArrayList<Integer> getAllValues = new ArrayList<>(map.values());
        System.out.println(getAllValues);
    }
}
