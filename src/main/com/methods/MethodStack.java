package main.com.methods;

public class MethodStack {
  static void m1() {
    System.out.println("I am inside the m1 method and going to call the m2 method. ");
    m2();
    System.out.println("The control has returned to the m1 method. ");
  }
  static void m2() {
    System.out.println("I am inside the m2 method and going to call the m3 method");
    m3();
    System.out.println("The control has returned to m2");
  }
  static void m3() {
    System.out.println("I am inside the m3 method.");
  }
  public static void main(String[] args) {
    m1();
  }
}