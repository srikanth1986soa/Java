package main.com.regex;

import java.util.regex. * ;
public class JavaRegexExample {
  public static void main(String args[]) {
    System.out.println("We will evaluate phone numbers in this program");
    System.out.println("Each phone number should be of 10 digits and should start with 4,5,6");
    System.out.println("We will take the help of character class moderators. ");
    System.out.println("Is 5953038949 a valid number? " + Pattern.matches("[456]{1}[0-9]{9}", "5953038949")); //true  
    System.out.println("Is 59537657755949 a valid number? " + Pattern.matches("[456][0-9]{9}", "59537657755949")); //false because more than 10 characters
    System.out.println("Is 99530112290 a valid number? " + Pattern.matches("[456][0-9]{9}", "99530112290")); //false (11 characters and starts with 9)  
    System.out.println("Is 6953038949 a valid number? " + Pattern.matches("[456][0-9]{9}", "6953038949")); //true (starts with 6)  
    System.out.println("Is 4333038949 a valid number? " + Pattern.matches("[456][0-9]{9}", "4333038949") + "\n"); //true  (starts with 4)
    System.out.println("With the help of metacharacters!! \n");
    System.out.println("Is 6353038949 a valid number? " + Pattern.matches("[456]{1}\\d{9}", "6353038949")); //true  
    System.out.println("Is 3853038949 a valid number? " + Pattern.matches("[456]{1}\\d{9}", "3853038949")); //false (starts from 3)
    System.out.println("The metacharacters help in identifying only digits i.e, [0-9]");
  }
}