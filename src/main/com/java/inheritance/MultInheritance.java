package main.com.java.inheritance;

interface first {
  public void firstmethod();
}
interface second {
  public void secondmethod();
}
interface third extends first,
second {
  public void mainmethod();
}
public class MultInheritance implements third {
  public void mainmethod() {
    System.out.println("This is the main interface method");
  }
  public void firstmethod() {
    System.out.println("Hey I am the first method defined the first interface");
  }
  public void secondmethod() {
    System.out.println("Hey I am the second method defined it the second interface");
  }
  public static void main(String[] args) {
    MultInheritance ob = new MultInheritance();
    ob.mainmethod();
    ob.firstmethod();
    ob.secondmethod();
  }
}