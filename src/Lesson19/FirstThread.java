package Lesson19;

public class FirstThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) { // не путать со старт
            System.out.println(i);
        }
    }
}
