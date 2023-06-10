package main.com.stringbuffer;

public class Insert
{
    public static void main(String args[])
    {  
        StringBuffer str=new StringBuffer("Data");  
        str.insert(4,"Flair"); 
        System.out.println(str);
    }  
} 