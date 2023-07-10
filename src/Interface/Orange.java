package Interface;

public class Orange extends Fruit {
    public Orange(int cost) {
        super(cost);
    }

    @Override
    void taste() {
        System.out.println("mmmmm");
    }
}
