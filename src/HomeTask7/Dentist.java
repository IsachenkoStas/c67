package HomeTask7;

public class Dentist extends Doctors{
    @Override
    void treat() {
        super.treat();
        System.out.println("Лечим кариес!!!");
    }
}
