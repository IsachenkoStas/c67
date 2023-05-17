package OOP;

public class Developer {
    public String name;
    public final static int SALARY = 647556586; // это поле теперь статичное, пренадлежит классу
    // может использовать только статические переменные

    public static void sayHello() {
        System.out.println("hello");
    }

}
