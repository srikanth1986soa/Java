package main.com.javamethodoverriding;

class Father {
  // private methods are not overridden 
  static void method1() {
    System.out.println("From static Father method1()");
  }
  void method2() {
    System.out.println("From Father method2()");
  }
}
class Child extends Father {
  // new method1() method 
  // This method is unique to Child class 
  static void method1() {
    System.out.println("From static Child method1()");
  }
  // overriding method 
  // with greater accessibility 
  void method2() {
    System.out.println("From Child method2()");
  }
}
// Driver class 
class StaticOverride {
  public static void main(String[] args) {
    Father obj1 = new Father();
    obj1.method2();
    Father obj2 = new Child();
    obj2.method1(); //According to dynamic method dispatch this should execute child class method but this executes parent class method. 
  }
}