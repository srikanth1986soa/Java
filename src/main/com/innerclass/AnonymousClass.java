package main.com.innerclass;

class OuterClass3 {
  void print() {
    System.out.println("I am in the print method of superclass");
  }
}



class AnonymousClass {
  //  An anonymous class with OuterClass as base class 
  //start of the anonymous class.
  static OuterClass3 out = new OuterClass3() {
    void print() {
      super.print();
      System.out.println("I am in Anonymous class");
    }
  };
  public static void main(String[] args) {
    out.print();
  }
}