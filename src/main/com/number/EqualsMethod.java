package main.com.number;

public class EqualsMethod {
  public static void main(String[] args) {
    Integer num1 = new Integer("5");
    Short s = new Short("5");
    Integer num2 = new Integer("5");
    System.out.println("Is the short value equal to num1? " + num1.equals(s));
    System.out.println("is the integer value equal to num1? " + num1.equals(num2));
  }
}