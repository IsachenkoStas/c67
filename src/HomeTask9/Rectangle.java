package HomeTask9;

public class Rectangle extends Figure {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        if (a > 0) {
            this.a = a;
        } else {
            System.out.println("error");
        }
        if (b > 0) {
            this.b = b;
        } else {
            System.out.println("error");
        }
    }

    @Override
    double perimeter() {
        return (a + b) * 2;

    }

    @Override
    double square() {
        return a * b;
    }
}
