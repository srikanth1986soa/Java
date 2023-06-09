package main.com.filehandling;

import java.io.InputStream;
import java.io.FileInputStream;
import java.io.Reader;
import java.io.InputStreamReader;
public class ByteStreamRead
{
       public static void main(String[] args) {  
        try  {  
            InputStream fread = new FileInputStream("G:\\Internship\\File Handling\\NewFile.txt");  
            Reader freader = new InputStreamReader(fread);  
            int data = freader.read();  
            while (data != -1) {  
                System.out.print((char) data);  
                data = freader.read();  
            }  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
}