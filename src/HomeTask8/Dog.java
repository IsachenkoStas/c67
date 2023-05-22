package HomeTask8;

public class Dog extends Animal {
    @Override
    void voice() {
        System.out.println("Dog's bark");
    }

    @Override
    void eat(String food) {
        if (food.equals("meat")) {
            System.out.println("Thank u mister <3");
        } else if (food.equals("grass")) {
            System.out.println("I am not a herbivore");
        } else {
            System.out.println("I have no idea what kind of food it is");
        }
    }
}
