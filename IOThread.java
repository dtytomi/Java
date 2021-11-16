import java.lang.Thread;

public class IOThread extends Thread {
    
    @Override
    public void run() {
        System.out.println(this.getName() + " started.");
        
        try {
            Thread.sleep(2000);     // sleep for 2 seconda to simulate
                                    // an IO task takes a long time
        } 
        catch (InterruptedException e) {}
        System.out.println(this.getName() + " finished.");
    }

}
