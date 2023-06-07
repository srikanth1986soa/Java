package main.com.forloop;

import java.util.*;
public class EnhancedForLoop
{
  public static void main (String[]args)
  {
        ArrayList<Integer>values=new ArrayList<>();
        for(int variable=10;variable<=50;variable+=10)
        {
            values.add(variable);//Adding the elements in the list. 
        }
        System.out.println("Now we will use the for each loop to print the elements in the ArrayList");
        for(Integer i:values)
        {
            System.out.print(i+" ");
        }
  }
}