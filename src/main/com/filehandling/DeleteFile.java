package main.com.filehandling;

import java.io.File;
public class DeleteFile
{
     public static void main(String[] args)
     {  
        File fdel = new File("G:\\Internship\\File Handling\\NewFile.txt");   
        if (fdel.delete())
        { 
            System.out.println(fdel.getName()+ " is deleted successfully.");  
        }
        else 
        {  
            System.out.println("Could Not Delete File");  
        }
    }
}