package main.com.javanull.test;

public class Main
{
    public static String nullreturnfunc()
    {
        return null;
        
    }
    public static void main (String[] args) {
        String test;
        test=nullreturnfunc();
        try 
        {
            System.out.println(test.charAt(3));
        } 
        catch(Exception e) 
        {
            System.out.println("The value is null!");
        }
    }
}