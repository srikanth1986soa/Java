package main.com.access.modifiers.p2;


import main.com.access.modifiers.p1.ProtectedClass1;

public class ProtectedClass2 extends ProtectedClass1 {
  public static void main(String[] args) {
    ProtectedClass2 ob = new ProtectedClass2();
    ob.speak();
  }
}