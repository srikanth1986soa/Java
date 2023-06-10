package main.com.multithreading;

class Working implements Runnable {
    public void run() {
        for (int i = 0; i <= 10; i++) 
        {
            try 
            {   System.out.println("The thread " + Thread.currentThread().getName() + " is running");
                Thread.sleep(1000);
            } 
            catch (InterruptedException e) 
            {
                System.out.println("There has been an error"+e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
public class ImplementRunnable {
    public static void main(String[] args) {
        Working w1=new Working();
        Working w2=new Working();
        Thread t1=new Thread(w1);
        Thread t2=new Thread(w2);
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t1.start();
        t2.start();
        
    }
}