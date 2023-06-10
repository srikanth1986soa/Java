package main.com.consoleInput;

import java.util.*;
public class ScannerClassInput
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        System.out.println("The String is: " +str);
        System.out.println("Enter an Integer");
        int i = sc.nextInt();
        System.out.println("The Integer is: " +i);
        System.out.println("Enter a Float value");
        float f = sc.nextFloat();
        System.out.println("The Float value is: " +f);
    }
}