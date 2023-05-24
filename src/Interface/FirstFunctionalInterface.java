package Interface;

@FunctionalInterface // один абстактный, остальных сколько хочешь
public interface FirstFunctionalInterface {
    int shouldBeOneMethod();

    default void hello(){
        System.out.println("Default realization <3");
    }
}