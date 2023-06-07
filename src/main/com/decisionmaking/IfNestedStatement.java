package main.com.decisionmaking;

public class IfNestedStatement {
  public static void main(String[] args) {
    System.out.println("Understanding if statements.");
    String s = "DataFlair";
    if (s.equals("DataFlair")) {
      System.out.println("The string is DataFlair");
      if (s.charAt(0) == 'D') {
        System.out.println("The first character is D! ");
      }
    }
    else {
      System.out.println("The string is not DataFlair");
    }
  }
}