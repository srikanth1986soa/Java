package main.com.stringbuffer;

public class DeleteCharAt
{
    public static void main(String[] args) {
    StringBuffer str = new StringBuffer("DataFlair");
    System.out.println("Original String is: " + str);
    str.deleteCharAt(1);
    System.out.println("The String after deleting a character at 1st index: " + str);
    str.deleteCharAt(5);
    System.out.println("The String after deleting a character at 5th index: " + str);
  }
}