package main.com.number;

public class ValueOfMethod {
  public static void main(String[] args) {
    Integer int1 = new Integer("167");
    System.out.println("Using Integer.valueOf(int1) is " + Integer.valueOf(int1));
    System.out.println("Using Integer.valueOf(\"542\") is " + Integer.valueOf("542"));
    System.out.println("Using Integer.valueOf(\"AB2\") is " + Integer.valueOf("AB2", 16));
  }
}