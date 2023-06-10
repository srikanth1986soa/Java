package main.com.synchronization.test;

class Sender
{
public void send(String msg)
{
synchronized(this)
{
System.out.println("Sending\t" + msg );
try
{
Thread.sleep(1000);
GC.getR
}
catch (Exception e)
{
System.out.println("Thread interrupted.");
}
System.out.println("\n" + msg + "Sent");
}
}