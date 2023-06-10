package main.com.iterator;

import java.util.ArrayList;
import java.util.ListIterator;
public class Test3
{
   public static void main(String[] args)
   {
       ArrayList al = new ArrayList();
       for (int i = 0; i < 10; i++)
           al.add(i);
       System.out.println(al);
       ListIterator ltr = al.listIterator();
       while (ltr.hasNext())
       {
           int i = (Integer)ltr.next();
           System.out.print(i + " ");
           if (i%2==0)
           {
               i++;
               ltr.set(i);
               ltr.add(i);         }
       }
       System.out.println();
       System.out.println(al);
   }
}