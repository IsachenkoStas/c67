package Stream;

public class Optional {
    public static void main(String[] args) {

/*        // Create Optional
        Optional<Object> firstOptional = Optional.empty();

        Optional<String> str = Optional.of("Hola"); // Если уверены что объект не null

        String line = "group67";
        Optional<String> stringOptional = Optional.ofNullable(line);

        // Check is empty or not
        System.out.println(str.isEmpty());

        //  Run some code
        str.ifPresent(p -> System.out.println(p)); // выполняет действие если optional не пустой

        // open Optional
        String res1 = stringOptional.orElse("DEFAULT_VALUE");
        String res2 = stringOptional.orElseGet(() -> "DEFAULT_VALUE");
        String res3 = stringOptional.get();
        String res4 = stringOptional.orElseThrow(() -> new ArithmeticException());

        Optional<String> result = stringOptional.filter(value -> value.equals("group67")); // если фильтр true - Optional с объектом, если false - Optional.empty
        System.out.println(result);

        // map () принимает значение и отдает другое
        int size = stringOptional.map(value -> value.length()).orElse(0);
        System.out.println(size);*/

        User user = null;
        java.util.Optional<User> userOptional = java.util.Optional.ofNullable(user);
        String takeResult = userOptional.map(u -> u.getName()).orElse("Default");
        System.out.println(takeResult);
    }
}