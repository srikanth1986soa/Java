package main.com.interfaces;

class InterfaceClass {
  interface InnerInterface {
    void myMethod();
  }
}
class NestedInterface1 implements InterfaceClass.InnerInterface {
  public void myMethod() {
    System.out.println("This is the nested interface method in the class. ");
  }
  public static void main(String args[]) {
    NestedInterface1 object = new NestedInterface1();
    object.myMethod();
  }
}