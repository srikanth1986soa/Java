package main.com.collections;

import java.util.*;
public class LinkedHashset
{
    public static void main(String args[])
    {  
        LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();  
        set.add(1);  
        set.add(7);  
        set.add(10);  
        set.add(50);  
        Iterator<Integer> itr=set.iterator();  
        while(itr.hasNext())
        {  
            System.out.println(itr.next());  
        }  
    }
}