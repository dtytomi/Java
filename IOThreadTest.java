import java.lang.Thread;

public class IOThreadTest {
    
    public static void main(String[] args) {
        
        Thread t1 = Thread.currentThread();
        System.out.println(t1.getName() + " started.");
        
        Thread t2 =  new IOThread();    // create the IO thread
        t2.start();
        System.out.println(t1.getName() + " starts " + t2.getName() + ".");

        System.out.println(t1.getName() + " finished.");

    }

}
