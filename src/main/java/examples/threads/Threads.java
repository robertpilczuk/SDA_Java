package examples.threads;

import static java.lang.Thread.sleep;

public class Threads {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Thread 1");
                try {
                    sleep(11);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Thread 2");

                    try {
                        sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread 2");
                    try {
                        sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread 2");

                }
            }
        });


        Runnable runnable = () -> {

        };

        thread.start();
        thread2.start();
        thread.join();
        thread2.join();
    }

}
