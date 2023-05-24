package HomeTask9;

public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;
    private double h;

    public Triangle(double a, double b, double c, double h) {
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
        if (c > 0) {
            this.c = c;
        } else {
            System.out.println("error");
        }
        if (h > 0) {
            this.h = h;
        } else {
            System.out.println("error");
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
