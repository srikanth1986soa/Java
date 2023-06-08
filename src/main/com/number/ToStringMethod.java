package main.com.number;

public class ToStringMethod {
  public static void main(String[] args) {
    Integer int1 = new Integer("167");
    System.out.println("Converting to decimal string" + int1.toString());
    System.out.println("Converting to octal string " + Integer.toOctalString(int1));
    System.out.println("Converting to Hexadecimal string " + Integer.toHexString(int1));
  }
}