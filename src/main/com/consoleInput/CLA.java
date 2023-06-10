package main.com.consoleInput;

public class CLA
{
    public static void main(String args[])
    {
        System.out.println("The input through Command Line Argument is: ");
        for(int i=0;i<args.length;i++)
        {
            System.out.println(args[i]);
        }
    }
}