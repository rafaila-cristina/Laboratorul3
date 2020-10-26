package ro.mta.facc.softing;

public class myThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello from "+Thread.currentThread().getName());
    }
}
