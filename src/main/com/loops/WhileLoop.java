package main.com.loops;

import java.io. * ;
public class WhileLoop {
  public static void main(String[] args) {
    int i = 0;
    while (i < 5) {
      System.out.println("Learning Java at DataFlair");
      System.out.println("The value of i is = " + i);
      i++;
    }
    System.out.println("The value of i became " + i + " that is why it broke out of the loop");
  }
}