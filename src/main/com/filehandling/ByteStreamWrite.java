package main.com.filehandling;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
public class ByteStreamWrite
{
       public static void main(String[] args) {  
        try { 
            OutputStream fwrite = new FileOutputStream("G:\\Internship\\File Handling\\NewFile.txt");  
            Writer fwriteWriter = new OutputStreamWriter(fwrite);  
            fwriteWriter.write("Writing Using OutputStreamWriter!!!");  
            fwriteWriter.close();  
        } catch (Exception e) {  
            e.getMessage();  
        }  
    }  
}  