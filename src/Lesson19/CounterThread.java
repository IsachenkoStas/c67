package Lesson19;

public class CounterThread implements Runnable {
    Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread() + " Begin");
        synchronized (counter){
            counter.setCounter(1);
            for (int i = 0; i < 5; i++) {
                System.out.print(counter.getCounter() + " ");
                counter.increase();
            }
        }
        System.out.println(Thread.currentThread() + " The end");
    }
}