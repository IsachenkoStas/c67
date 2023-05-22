package HomeTask8;

public class Tiger extends Animal {
    @Override
    void voice() {
        System.out.println("Tiger roar");
    }

    @Override
    void eat(String food) {
        if (food.equals("meat")) {
            System.out.println("I like it!!!!!");
        } else if (food.equals("grass")) {
            System.out.println("I am not a herbivore");
        } else {
            System.out.println("I have no idea what kind of food it is");
        }
    }
}
