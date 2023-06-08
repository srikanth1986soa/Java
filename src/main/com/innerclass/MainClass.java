package main.com.innerclass;

public class MainClass {
  public static void main(String[] args) {
    OuterClass2 out = new OuterClass2();
    out.outerClassMethod();
  }
}

class OuterClass2 {
  void outerClassMethod() {
    final String site = "lets learn java raining";
    System.out.println("Hey I am inside outerClassMethod");
    class InnerClass {
      void innerClassMethod() {
        System.out.println("I am studying Java at " + site);
      }
    }
    InnerClass in =new InnerClass(); in .innerClassMethod();
  }
}