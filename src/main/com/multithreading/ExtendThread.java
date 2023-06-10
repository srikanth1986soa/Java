package main.com.multithreading;

class Work extends Thread
{
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println("The thread "+Thread.currentThread().getName()+" is running");
        }
    }
}
public class ExtendThread
{
    public static void main(String[] args) {
        Work a1= new Work();
        a1.setName("Thread 1");
        Work a2=new Work();
        a2.setName("Thread 2");
        a1.start();
        a2.start();
    }
}