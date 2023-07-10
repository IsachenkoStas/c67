package Exceptions;

public class Person {
    private int age;

    public Person(int age) {
        if (age < 18) {
            try {
                throw new MyFirstException(age);
            } catch (MyFirstException e) {
                e.printStackTrace();
            }
        }
        this.age = age;
    }
}