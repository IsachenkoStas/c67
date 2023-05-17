package OOP;

public class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("I draw circle");
    }

    @Override
    void erase() {
        System.out.println("i erase circle");
    }
}
