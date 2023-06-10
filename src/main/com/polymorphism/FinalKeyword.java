package main.com.polymorphism;

class FinalClass {
  int a;
  public final void print() {
    System.out.println("This is a parent-class method. ");
  }
}
public class FinalKeyword extends FinalClass {
  final int WHEELS;

  FinalKeyword() {
    WHEELS = 4;
  }

  /* void print() {
     //System.out.println(++WHEELS);//This statement would result in an error
     System.out.println(WHEELS);
   }*/
  public static void main(String[] args) {
    FinalKeyword f = new FinalKeyword();
    f.print();
  }
}