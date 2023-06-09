package main.com.filehandling;

import java.io.FileReader;
public class CharacterStreamRead
{
    public static void main(String args[])throws Exception
    {    
         FileReader fr=new FileReader("G:\\Internship\\File Handling\\NewFile.txt");    
         int i;    
         while((i=fr.read())!=-1)    
              System.out.print((char)i);    
         fr.close();    
    }    
}