package HomeTask7;

public class Surgeon extends Doctors {
    @Override
    void treat() {
        super.treat();
        System.out.println("Нужна операция");
    }
}
