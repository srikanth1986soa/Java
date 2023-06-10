package main.com.regex;

import java.util.regex. * ;
public class MetaCharacterRegex {
  public static void main(String[] args) {
    System.out.println(Pattern.matches("\\d", "dataflair")); //false (non-digit)  
    System.out.println(Pattern.matches("\\d", "1")); //true (digit and comes once)  
    System.out.println(Pattern.matches("\\d", "78643")); //false (digit but comes more than once)  
    System.out.println(Pattern.matches("\\d", "3723ytec")); //false (digit and char)
    System.out.println(Pattern.matches("\\D", "abc")); //false (non-digit but comes more than once)  
    System.out.println(Pattern.matches("\\D", "9")); //false (digit)  
    System.out.println(Pattern.matches("\\D", "12873")); //false (digit)  
    System.out.println(Pattern.matches("\\D", "390()3@bc")); //false (digit and char)  
    System.out.println(Pattern.matches("\\D", "(")); //true (non-digit and comes once) 
  }
}