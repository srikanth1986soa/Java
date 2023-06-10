package main.com.regex;

import java.util.regex. * ;
public class CharacterClassRegex {
  public static void main(String[] args) {
    boolean isMatch = Pattern.matches("[a-z]", "a"); //true because a lies in the mentioned limit
    System.out.println(isMatch);
    isMatch = Pattern.matches("[a-zA-Z0-9]", "D"); //true because D lies in the mentioned conditions
    System.out.println(isMatch);
    isMatch = Pattern.matches("[a-zA-Z&&[^pqn]]", "p"); //false because the expression excludes p. . 
    System.out.println(isMatch);
  }
}