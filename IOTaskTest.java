import java.lang.Thread;

public class IOTaskTest {
    
    public static void main(String[] args) {
        
        Thread t1 = Thread.currentThread();
        System.out.println(t1.getName() + " started.");
        
        Thread t2 =  new Thread(new IOTask());    // create the new thread
        t2.start();                                 // start the new thread 
        System.out.println(t1.getName() + " starts " + t2.getName() + ".");

        System.out.println(t1.getName() + " finished.");

    }

}
