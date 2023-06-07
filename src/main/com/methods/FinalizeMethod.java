package main.com.methods;

public class FinalizeMethod {
  public void objcheck() {
    System.out.println("The object is still alive. ");
  }
  protected void finalize() {
    System.out.println("Code to be executed before object collection by JVM ");
  }
  public static void main(String[] args) {
    FinalizeMethod ob = new FinalizeMethod();
    ob.objcheck();
    ob = null;
    System.gc();
  }
}