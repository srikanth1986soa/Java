package main.com.datetime;

import java.util.*;
import java.text.*;
public class parseDate
{
     public static void main(String args[]) {
      SimpleDateFormat formatofDate = new SimpleDateFormat ("yyyy-MM-dd"); 
      String input = args.length == 0 ? "2021-08-19" : args[0]; 
      System.out.print(input + " is Parsed as "); 
      Date t;
      try {
         t = formatofDate.parse(input); 
         System.out.println(t); 
      } catch (ParseException e) { 
         System.out.println("The string is unparseable " + formatofDate); 
      }
   }
}