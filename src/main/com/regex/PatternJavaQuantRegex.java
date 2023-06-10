package main.com.regex;

import java.util.regex. * ;
public class PatternJavaQuantRegex {
  public static void main(String[] args) {
    boolean isMatch = Pattern.matches("[jav]?", "java"); //false  because j,a,v must be present only once.        
    System.out.println(isMatch);
    isMatch = Pattern.matches("[jav]+", "java"); //true because each and every character has occurred once or more than once
    System.out.println(isMatch);
    isMatch = Pattern.matches("[jav]*", "javaaa"); //true because the letters j,v,a has occurred zero or more times. 
    System.out.println(isMatch);
  }
}