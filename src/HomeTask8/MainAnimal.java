package HomeTask8;

public class MainAnimal {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Dog d = new Dog();
        Rabbit r = new Rabbit();
        tiger.eat("meat");
        tiger.voice();
        d.eat("shawerma");
        d.voice();
        r.eat("grass");
        r.voice();
    }
}