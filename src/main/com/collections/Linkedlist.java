package main.com.collections;

import java.util.*;
public class Linkedlist
{
    public static void main(String args[])
   {  
        LinkedList<Integer> L=new LinkedList<Integer>();  
        L.add(1);  
        L.add(7);  
        L.add(10);  
        L.add(50);  
        Iterator<Integer> i=L.iterator();  
        while(i.hasNext())
        {  
            System.out.println(i.next());  
        }  
   }  
}