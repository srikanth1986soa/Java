package main.com.interfaces;

interface OuterInterface {
  void display();
  interface InnerInterface {
    void myMethod();
  }
}
class NestedInterface implements OuterInterface.InnerInterface {
  public void myMethod() {
    System.out.println("This is the nested interface method");
  }
  public static void main(String args[]) {
    NestedInterface1 object = new NestedInterface1();
    object.myMethod();
  }
}