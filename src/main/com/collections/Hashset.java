package main.com.collections;

import java.util.*;
public class Hashset
{
    public static void main(String args[])
    {  
        HashSet<Integer> set=new HashSet<Integer>();  
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