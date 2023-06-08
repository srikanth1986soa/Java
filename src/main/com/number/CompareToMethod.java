package main.com.number;

public class CompareToMethod {
  public static void main(String[] args) {
    Integer num1 = new Integer("5");
    System.out.println("comparing num1 with 10 is " + num1.compareTo(10));
    System.out.println("comparing num1 with 1 is " + num1.compareTo(1));
  }
}