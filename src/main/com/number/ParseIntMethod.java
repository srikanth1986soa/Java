package main.com.number;

public class ParseIntMethod {
  public static void main(String[] args) {
    int num1 = Integer.parseInt("AB", 16);
    int num2 = Integer.parseInt("1001", 2);
    int num3 = Integer.parseInt("543"); //if no radix is mentioned it is converted to decimal. 
    System.out.println("num1 " + num1); //Hexadecimal converted to decimal
    System.out.println("num2 " + num2); //Binary converted to decimal
    System.out.println("num3 " + num3); //Direct conversion of string to decimal
  }
}