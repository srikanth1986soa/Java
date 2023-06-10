package main.com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
public class BasicMethod {
  private static String REGEX = "[";
  private static String INPUT = "DataFlair is a great palce to learn " + "DataFlair has a wide range of articles!.";
  private static String REPLACE = "Java";
  public static void main(String[] args) {
    try {
      Pattern pattern = Pattern.compile(REGEX);
      // get a matcher object
      Matcher matcher = pattern.matcher(INPUT);
      INPUT = matcher.replaceAll(REPLACE);
    } catch(PatternSyntaxException e) {
      System.out.println("PatternSyntaxException: ");
      System.out.println("Description: " + e.getDescription());
      System.out.println("Index: " + e.getIndex());
      System.out.println("Message: " + e.getMessage());
      System.out.println("Pattern: " + e.getPattern());
    }
  }
}