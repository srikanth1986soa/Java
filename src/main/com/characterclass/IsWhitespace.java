package main.com.characterclass;

import java.util. * ;
public class IsWhitespace {
  public static void main(String[] args) {
    System.out.println("The value of isWhitespace(' ') is " + Character.isWhitespace(' '));
    System.out.println("The value of isWhitespace('\\n') is " + Character.isWhitespace('\n'));
    System.out.println("The value of isWhitespace('\\t') is " + Character.isWhitespace('\t'));
    System.out.println("The value of isWhitespace('b') is " + Character.isWhitespace('b'));
  }
}