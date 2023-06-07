package main.com.objcreation;

import java.io.*;
public class Serialization
{
    public static void main(String args[])  
    {    
        try  
        {        
            Intern I = new Intern(1,"Arka Ghosh");  
            FileOutputStream fout=new FileOutputStream("interns.txt"); 
            ObjectOutputStream out=new ObjectOutputStream(fout);    
            out.writeObject(I);    
            out.flush();       
            out.close();    
            System.out.println("Created text file successfully!!!");    
        }  
        catch(Exception e)  
        {  
            System.out.println(e);  
        }    
    }    
}