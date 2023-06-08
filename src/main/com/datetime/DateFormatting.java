package main.com.datetime;

import java.util.*;
import java.text.*;
public class DateFormatting
{
    public static void main(String args[]) 
   {
      Date CurrDate = new Date( );
      SimpleDateFormat formatDate = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
      System.out.println("Current Date(Formatted): " + formatDate.format(CurrDate));
   }
}