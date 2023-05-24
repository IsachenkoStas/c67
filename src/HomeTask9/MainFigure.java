package HomeTask9;

public class MainFigure {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = new Triangle(-5, 6, 7, 5);
        figures[1] = new Triangle(3, 3, 3, 2.6);
        figures[2] = new Rectangle(10, 5);
        figures[3] = new Circle(15);
        figures[4] = new Circle(10);
        double sumPerimeters = 0;
        for (Figure figure : figures) {
            double perimeters = figure.perimeter();
            sumPerimeters += perimeters;
        }
        System.out.println("Сумма периметров всех фигур = " + sumPerimeters);
    }
}