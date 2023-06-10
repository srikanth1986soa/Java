package main.com.collections;

import java.util.*;
public class Vectors
{
    public static void main(String args[])
    {  
        Vector<Integer> v=new Vector<Integer>();  
        v.add(1);  
        v.add(7);  
        v.add(10);  
        v.add(50);  
        Iterator<Integer> i=v.iterator();  
        while(i.hasNext())
        {  
            System.out.println(i.next());  
        }  
}  
}