package main.com.decisionmaking;

public class IfElseIfStatement {
  public static void main(String[] args) {
    System.out.println("Understanding if statements.");
    String s = "DataFlairPython";
    if (s.equals("DataFlair")) {
      System.out.println("The string is DataFlair");
    }
    else if (s.equals("DataFlairJava")) {
      System.out.println("The string is DataFlair and course is Java");
    }
    else if (s.equals("DataFlairPython")) {
      System.out.println("The string is DataFlair and the course is Python");
    }
  }
}