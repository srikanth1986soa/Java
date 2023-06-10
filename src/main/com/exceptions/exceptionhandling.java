package main.com.exceptions;

public class exceptionhandling
{
  public static void main(String[] args) {
    try {
      char[] ch = {'D', 'A', 'T', 'A', 'F', 'L', 'A', 'I', 'R'};
      System.out.println(ch[10]);
    } catch (Exception e) {
      System.out.println("Something went wrong in the indexing of Array");
    } finally {
      System.out.println("The 'try catch' is over, continuing the program from here!");
    }
  }
}