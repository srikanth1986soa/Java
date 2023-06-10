package main.com.polymorphism;

class Parent {
  Parent covar() {
    return this;
  }
}
class Child extends Parent {
  Child covar() {
    return this;
  }
  void print() {
    System.out.println("This is the covariant return type.");
  }
}
public class CovarReturn {
  public static void main(String[] args) {
    new Child().covar().print();
  }
}