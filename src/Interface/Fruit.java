package Interface;

//может иметь абстрактные методы
public abstract class Fruit { // класс не может создавать объект

    private int cost;

    public Fruit(int cost) {
        this.cost = cost;
    }

    abstract void taste();
}
