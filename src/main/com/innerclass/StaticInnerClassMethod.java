package main.com.innerclass;

class Outer1Class {
  public class InnerClass {
   // static public void print() {
      //ystem.out.println("I am printing from inner class!");
    //}
  }
}
public class StaticInnerClassMethod {
  public static void main(String[] args) {
    OuterClass.InnerClass in =new OuterClass().new InnerClass(); in .print();
  }
}