package HomeTask7;

import java.lang.reflect.Field;

public class MainApple {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Apple apple = new Apple();
        System.out.println(apple.getColor());
        Field field = apple.getClass().getDeclaredField("color");
        field.setAccessible(true);
        field.set(apple, "Purple");
        System.out.println(apple.getColor());
    }
}