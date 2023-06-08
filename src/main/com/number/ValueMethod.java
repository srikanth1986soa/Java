package main.com.number;

public class ValueMethod {
  public static void main(String[] args) {
    Integer num1 = new Integer("5");
    float f = num1.floatValue();
    double d = num1.doubleValue();
    System.out.println("The integer value converted to float is " + f);
    System.out.println("The integer value converted to double is " + d);
  }
}