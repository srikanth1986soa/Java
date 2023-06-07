package main.com.methods;

public class OverloadMethod {
  static void add(int num1, int num2) {
    System.out.println("The compiler understood you wanted to add two numbers of type int");
    System.out.println("The sum of the two numbers " + num1 + " and " + num2 + " is " + (num1 + num2));
  }
  static void add(double num1, double num2) {
    System.out.println("The compiler understood you wanted to add two  numbers of type double. ");
    System.out.println("The sum of the two numbers " + num1 + " and " + num2 + " is " + (num1 + num2));
  }
  public static void main(String[] args) {
    add(5, 9);
    add(6.3, 8.2);
  }
}