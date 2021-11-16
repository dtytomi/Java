import java.lang.Thread;

public class IOTask implements Runnable {
    
    @Override
    public void run() {
        Thread ct = Thread.currentThread();
        System.out.println(ct.getName() + " started.");
        
        try {
            Thread.sleep(2000);     // sleep for 2 seconda to simulate
                                    // an IO task takes a long time
        } 
        catch (InterruptedException e) {}
        System.out.println(ct.getName() + " finished.");
    }

}
