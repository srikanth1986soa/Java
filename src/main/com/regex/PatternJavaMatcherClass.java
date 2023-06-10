package main.com.regex;


import java.util.regex. * ;
public class PatternJavaMatcherClass {
  public static void main(String args[]) {
    // Let's define a pattern to search from.  
    Pattern pattern = Pattern.compile("Da*");
    // Search above pattern in "Data-Flair.training" 
    Matcher m = pattern.matcher("Data-Flair.training");
    // Printing the starting and ending indexes of the pattern 
    // in text 
    System.out.println("Searching for pattern " + pattern + " in Data-Flair.training");
    while (m.find())
    System.out.println("Pattern found from " + m.start() + " to " + (m.end() - 1));
  }
}