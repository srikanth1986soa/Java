package main.com.consoleInput;

import java.io.*;
public class ConsolePasswordInput
{
    public static void main(String args[])
    {    
        Console c=System.console();    
        System.out.println("Enter password: ");    
        char[] passcode=c.readPassword();    
        String pass=String.valueOf(passcode);  
        System.out.println("The Password is: "+pass);    
    }    
}