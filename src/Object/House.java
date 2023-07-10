package Object;

import java.util.Objects;

public class House implements Cloneable {
    private int cost;
    private String color;
    private Dog dog;

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "House: cost = " + cost + ", color: " + color + " . ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return cost == house.cost && Objects.equals(color, house.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cost, color);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        House house = (House) super.clone();
        house.dog = (Dog) dog.clone();
        return house;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
