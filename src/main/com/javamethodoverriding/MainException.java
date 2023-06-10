package main.com.javamethodoverriding;

import java.io. * ;
class Parent {
  void methodname() throws IOException {
    System.out.println("I do not have any checked excpetions.");
  }
}
class Child1 extends Parent {
  void methodname() throws IOException {
    System.out.println("I throw checked exceptions");
  }
}
class Child2 extends Parent {
  void methodname() throws Exception {
    System.out.println("Exception Hierarchy");
  }
}
public class MainException {
  public static void main(String[] args) {
    Parent p = new Child1();
    p.methodname();
    Parent p1 = new Child2();
    p1.methodname();
  }
}