package threads;

public class CodeExecutedInThread implements Runnable {

    private Listener listener;

    public CodeExecutedInThread(Listener listener) {
        this.listener = listener;
    }

    @Override
    public void run() {
        System.out.println("I am running in thread.");
        listener.getData();
    }
}
