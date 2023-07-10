package Lambda;

import java.util.List;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Lambda {
    public static void main(String[] args) {
        //create lambda
//        FunInterface firstLambda = (a, b) -> a + b;
//        FunInterface secLambda = (a, b) -> a - b;
//
//        //use lambda
//        long res = firstLambda.sum(10, 20);
//        System.out.println(res);

//        UnaryOperator<Integer> firstLambda = (a) -> a * a;
//        BinaryOperator<Integer> secLambda = (a, b) -> a + b;

//        Predicate<Integer> pl = (number) -> number % 2 == 0;
//        System.out.println(pl.test(5)); // принимает параметр, возвращает булевое значение

//        Consumer<Integer> cl =(a) -> System.out.println(a); // принимает параметр, но не возвращает результат
//        System.out::println - когда принимает только один параметр можно написать так

//        Supplier<Integer> sl = () -> {
//            Scanner scanner = new Scanner(System.in);
//            return scanner.nextInt();
//        }; // не принимает параметр, но возвращает значение

//        Function<String, Integer> fl = (a) -> Integer.parseInt(a); // принимает один тип, а возвращает другой

        BinaryOperator<Integer> bl = (a, b) -> {
            if (a < b) {
                return a;
            }
            if (a > b) {
                return b;
            }
            return 0;
        };
        System.out.println(bl.apply(11, 10));
    }
}