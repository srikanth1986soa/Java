package main.com.polymorphism;

public class OperatorOverload {
  public static void PlusOperator(int num1, int num2) {
    System.out.println("The plus operator can add two integers! " + (num1 + num2));
  }
  public static void PlusOperator(String str1, String str2) {
    System.out.println("The plus operator can also concatenate two strings! " + (str1 + str2));
  }
  public static void main(String[] args) {
    String str1 = "Data",
    str2 = "Flair";
    int num1 = 10,
    num2 = 14;
    PlusOperator(str1, str2);
    PlusOperator(num1, num2);
  }
}