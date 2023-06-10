package main.com.abstraction;

interface inface {
  void func1();
  void func2();
}
abstract class Class1 implements inface {
  public void func2() {
    System.out.println("I am the second function!");
  }
  //This class does not override all functions hence this is also abstract
}
class Class2 extends Class1 {
  public void func1() {
    System.out.println("I am the first function!");
  }
}
class Abstraction {
  public static void main(String args[]) {
    Class2 obj = new Class2();
    obj.func1();
    obj.func2();
  }
}