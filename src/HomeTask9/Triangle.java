package HomeTask9;

public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;
    private double h;

    public Triangle(double a, double b, double c, double h) {
        if (a > 0 && b > 0 && c > 0 && h > 0) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.h = h;
        } else {
            System.out.println("Wrong number!!!");
        }
    }

    @Override
    double perimeter() {
        return a + b + c;
    }

    @Override
    double square() {
        return (a / 2) * h;
    }
}
