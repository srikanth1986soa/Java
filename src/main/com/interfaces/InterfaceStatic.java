package main.com.interfaces;

interface Vehicle {
  public void accelerate();
  public static void brake() {
    System.out.println("This is a static method for braking");
  }
}
public class InterfaceStatic implements Vehicle {
  public void accelerate() {
    System.out.println("This is a nonstatic method for implementing acceleration in cars");
  }
  public static void main(String[] args) {
    InterfaceStatic object = new InterfaceStatic();
    object.accelerate();
    Vehicle.brake();
    System.out.println("Classic example of static methods in Interfaces");
  }
}