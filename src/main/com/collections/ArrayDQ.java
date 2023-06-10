package main.com.collections;

import java.util.*;
public class ArrayDQ
{
    public static void main(String[] args) 
    {  
        Deque<Integer> deque = new ArrayDeque<Integer>();  
        deque.add(1);  
        deque.add(7);  
        deque.add(10);    
        deque.add(50);    
        for (int i : deque) 
        {  
            System.out.println(i);  
        }  
    }
}