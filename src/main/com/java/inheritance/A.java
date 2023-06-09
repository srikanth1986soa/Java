package main.com.java.inheritance;

class A {
  A() {
    System.out.println("I am in class A! I have two children B and C");
  }
}
class B extends A {
  B() {
    System.out.println("I am in class B! I have 1 child D");
  }
}
class C extends A {
  C() {
    System.out.println("I am in class C. I am the child class of A");
  }
}
class D extends B {
  D() {
    System.out.println("I am in D class which is the extension of B class");
  }
}
class Main {
  public static void main(String[] args) {
    D d = new D(); //This calls constructors of parent class A and B
    B b = new B(); //This calls constructors parent class A and B
    C c = new C(); //This calls the constructors class A and C
  }
}