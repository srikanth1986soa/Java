package main.com.stringbuffer;

public class Replace
{
    public static void main(String args[])
    {  
        StringBuffer sb=new StringBuffer("Data");  
        sb.replace(2,3,"Flair");  
        System.out.println(sb); 
    }  
} 