package OOP;

public class Triangle extends Shape{
    @Override
    void draw() {
        System.out.println("I draw triangle");
    }

    @Override
    void erase() {
        System.out.println("I erase triangle");
    }
}
