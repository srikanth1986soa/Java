package main.com.collections;

import java.util.*;
public class Treeset
{
    public static void main(String args[])
    {  
        TreeSet<Integer> set=new TreeSet<Integer>();  
        set.add(1);  
        set.add(10);  
        set.add(50);  
        set.add(7);   
        Iterator<Integer> itr=set.iterator();  
        while(itr.hasNext())
        {  
            System.out.println(itr.next());  
        }  
    }  
}