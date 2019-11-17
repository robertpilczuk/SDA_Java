package threads;

public class CodeExecutedInThread implements Runnable {


    @Override
    public void run() {
        System.out.println("I am running in thread.");
    }
}
