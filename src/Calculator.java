public class Calculator {
    int weight = 15;
    int cost = 100;
    String color = "Red";



    public Calculator(int weight, int cost, String color) {
        this.weight = weight;
        this.cost = cost;
        this.color = color;
    }
    // Статический блок
    static {
        System.out.println("Статический блок");
    }

    // Логический блок (просто фигурные скобки)
    // Сначала Логический Блок, потом КОНСТРУКТОР
    {
        color = "Black";
        System.out.println("Creating calculator");
    }

    long findSum(int a, int b) {
        return a + b;
    }

    double findDel(int a, int b) {
        return (double) a / b;
    }

    int findRazn(int a, int b) {
        return a - b;
    }

    long findMult(int a, int b) {
        return a * b;
    }
}
