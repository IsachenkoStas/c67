package HomeTask8;

import Lessons.MyClass;

import java.lang.reflect.InvocationTargetException;

public class MainAnimal {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Rabbit r = new Rabbit();
        tiger.eat("meat");
        tiger.voice();
        Dog.dogEat("water");
        Dog.dogVoice();
        r.eat("grass");
        r.voice();
    }
}