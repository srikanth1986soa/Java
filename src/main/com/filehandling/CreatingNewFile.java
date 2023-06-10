package main.com.filehandling;

import java.io.File;
import java.io.IOException;  
public class CreatingNewFile
{
    public static void main(String args[])
    {  
          try {  
                   File fcreate = new File("G:\\Internship\\File Handling\\NewFile.txt");   
                    if (fcreate.createNewFile()) {  
                        System.out.println("File " + fcreate.getName() + " is created successfully.");
                    }
                     else {  
                              System.out.println("File is already exist in the directory."); 
                            }
                            } catch (IOException exception) {  
                          System.out.println("An unexpected error is occurred.");  
                          exception.printStackTrace();  
              }   
}
}