package Interface;

public class Dog implements Voice{
    @Override
    public void doVoice() {
        System.out.println("bark");
    }
}
