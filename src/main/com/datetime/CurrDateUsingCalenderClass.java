package main.com.datetime;

import java.util.Calendar;
public class CurrDateUsingCalenderClass
{
    public static void main(String args[]) 
    {
        Calendar current = Calendar.getInstance();
        System.out.println(current.getTime());
    }
}