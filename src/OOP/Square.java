package OOP;

public class Square extends Shape{
    @Override
    void draw() {
        System.out.println("I draw square");
    }

    @Override
    void erase() {
        System.out.println("I erase Square");
    }
}
