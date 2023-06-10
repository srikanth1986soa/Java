package main.com.collections;

import java.util.*;
public class Arraylist
{
    public static void main(String args[])
    {  
        ArrayList<Integer> arr=new ArrayList<Integer>(); 
        arr.add(1);
        arr.add(7);  
        arr.add(10);  
        arr.add(50);  
        Iterator i=arr.iterator();  
        while(i.hasNext())
        {  
            System.out.println(i.next());  
        }  
    }  
}  