package main.com.objcreation;

import java.io.*;
public class Deserialization
{
    public static void main(String args[])  
    {    
        try  
        {    
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("interns.txt"));
            Intern I1=(Intern)in.readObject();
            System.out.println("Intern ID and Name is:");
            System.out.println(I1.Internid+" "+I1.InternName);        
            in.close();    
        }  
        catch(Exception e)  
        {  
        System.out.println(e);  
        }    
    }    
}