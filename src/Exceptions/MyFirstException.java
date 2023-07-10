package Exceptions;

public class MyFirstException extends Exception {
    private int age;

    public MyFirstException(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "You use " + age + " ,but need age more than 18";
    }
}