package Interface;

public class BMW implements FirstInterface, SoundInterface, FirstFunctionalInterface { //имплементация

    @Override
    public void makeSound(String songName) {
        System.out.println("OG Buda");
    }

    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public int shouldBeOneMethod() {
        return 0;
    }

    @Override
    public void hello() {
        FirstFunctionalInterface.super.hello();
    }

    @Override
    public void start() {
        System.out.println("GO");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }

    @Override
    public void signal() {
        System.out.println("beep beep");
    }

/*    @Override
    public void changeSpeed(int newSpeed) {
        setSpeed(getSpeed() + newSpeed);
    }*/
}
