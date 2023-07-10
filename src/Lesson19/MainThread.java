package Lesson19;

public class MainThread {
    public static void main(String[] args) throws InterruptedException {
//        var line = """
//                hello my name is slim shady 12321543523784
//                """;
//        System.out.println(line.getClass().getName());
//        System.out.println(line);

//        System.out.println("beginin");
//        for (int i=0;i<20;i++){
//            FirstThread firstThread = new FirstThread();
//            firstThread.start();
//            try {
//                firstThread.join(); // поток-создатель ожидает завершения созданного потока
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println("the end");

//        Thread t = new Thread(() -> System.out.println("Multithread"));
//        Thread t = new Thread(){
//            @Override
//            public void run() {
//                System.out.println("Multithread");
//            }
//        };
//
//        t.setName("c67-thread");
//     //   t.setPriority(10);
//        t.start();
//        System.out.println(t);
//
//        Thread thread = new Thread(new SecondThread());
//        thread.start();
//        System.out.println(thread.isAlive());
//        FirstThread firstThread = new FirstThread();
//        firstThread.setDaemon(true);
//        firstThread.start();

        Counter counter = new Counter();

        for (int i = 0; i < 5; i++) {
            Thread t1 = new Thread(new CounterThread(counter));
            t1.start();
        }
    }
}
