package HomeTask8;

public class Rabbit extends Animal {
    @Override
    void voice() {
        System.out.println("Rabbit sound");
    }

    @Override
    void eat(String food) {
        if (food.equals("grass")) {
            System.out.println("Om-Nom-nom");
        } else if (food.equals("meat")) {
            System.out.println("I am not a carnivore");
        } else {
            System.out.println("I have no idea what kind of food it is");
        }
    }
}
