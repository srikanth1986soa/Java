package main.com.stringbuffer;

public class Delete
{
    public static void main(String args[])
    {  
        StringBuffer sb=new StringBuffer("DataFlair");  
        sb.delete(4,9);  
        System.out.println(sb);
    } 
}