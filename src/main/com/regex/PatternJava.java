package main.com.regex;

import java.util.regex. * ;
public class PatternJava {
  public static void main(String[] args) {
    //We define the regular expression first.
    //For that we shall use Pattern object and compile pattern. 
    System.out.println("The first method of using regex");
    Pattern p = Pattern.compile(".ataFlair"); // the dot(.) represents a single character
    Matcher m = p.matcher("DataFlair");
    boolean isMatch = m.matches();
    System.out.println(isMatch);
    //This is the first way of creating a regex program
    //the second way of using Regex in Java is
    System.out.println("The second method of using regex");
    boolean isMatch2 = Pattern.compile(".ataFlair").matcher("DataFlair").matches();
    System.out.println(isMatch2);
    //the third and the simplest way of creating regex
    System.out.println("The third method of using regex");
    boolean isMatch3 = Pattern.matches(".ataFlair", "DataFlair");
    System.out.println(isMatch3);
    //These are the basic ways of regex in Java    
  }
}