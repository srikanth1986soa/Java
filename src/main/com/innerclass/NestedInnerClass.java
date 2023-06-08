package main.com.innerclass;

class OuterClass {
  public class InnerClass {
    public void print() {
      System.out.println("I am printing from the inner class!");
    }
  }
}
public class NestedInnerClass {
  public static void main(String[] args) {
    OuterClass.InnerClass in =new OuterClass().new InnerClass(); in .print();
  }
}