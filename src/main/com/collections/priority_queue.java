package main.com.collections;

import java.util.*;
public class priority_queue
{
    public static void main(String args[])
    {  
        PriorityQueue<Integer> queue=new PriorityQueue<Integer>();  
        queue.add(1);  
        queue.add(7);  
        queue.add(10);  
        queue.add(50);  
        System.out.println("High Priority:"+queue.element());  
        System.out.println("High Priority:"+queue.peek());  
        System.out.println("Iterating through the queue :");  
        Iterator itr=queue.iterator();  
        while(itr.hasNext()){  
            System.out.println(itr.next());  
        }  
        queue.remove();  
        queue.poll();  
        System.out.println("After removing two elements from the Queue:");  
        Iterator<Integer> itr2=queue.iterator();  
        while(itr2.hasNext()){  
            System.out.println(itr2.next());  
        }  
}
}