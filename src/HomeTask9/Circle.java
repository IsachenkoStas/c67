package HomeTask9;

public class Circle extends Figure {
    private double r;

    public Circle(double r) {
        if (r > 0) {
            this.r = r;
        } else {
            System.out.println("Wrong number!!!");
        }
    }

    @Override
    double perimeter() {
        return Math.PI * r * 2;
    }

    @Override
    double square() {
        return Math.PI * r * r;
    }
}