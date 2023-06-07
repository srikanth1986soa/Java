package main.com.decisionmaking;

import java.util. * ;
public class ReturnStatement {
  static int funcsqr(int x) {
    return x * x;
  }
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      int y = funcsqr(5);
      System.out.println("The value returned by the function is " + y);
      return;
      // System.out.println("This statement would never get executed. ");
    }
  }
}