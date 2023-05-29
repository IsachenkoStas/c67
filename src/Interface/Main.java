package Interface;

public class Main {
    public static void main(String[] args) {
        System.out.println(FirstInterface.WHEELS);

        BMW car = new BMW();
        car.signal();


        FirstInterface.changeSpeed(564);

        FirstInterface automobile = new BMW();

        Cat pet = new Cat();
        pet.doVoice();
    }
}