package main.com.consoleInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferedReaderInput2
{
    public static void main(String[ ] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        String str = ""; 
        System.out.println("Enter the Strings and when you want to stop entering the Strings, type ‘.’");
        while(!str.equals("."))
        { 
            System.out.println("Enter a String: "); 
            str = br.readLine(); 
            System.out.println("The String input is: "+str); 
            if(str.contentEquals("."))
                System.out.println("FullStop!!!");
        } 
        br.close(); 
    }  
}