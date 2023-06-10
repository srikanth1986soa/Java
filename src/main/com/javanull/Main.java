package main.com.javanull;

import java.util.*;
public class Main
{
    public static String nullreturnfunc()
    {
        return null;
        
    }
    public static void main (String[] args) {
        String test;
        test=nullreturnfunc();
        if(test!=null)
        System.out.println(test.charAt(3));
        else
        System.out.println("The value is null!");
        
        
        
    }
}