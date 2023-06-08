package main.com.datetime;

import java.util.Date;
public class DateFormattingusingPrintf
{
    public static void main(String args[]) 
    {
      Date date = new Date();
      System.out.printf("%s %tB %<te, %<tY", "Current date of the system:", date);
   }
}