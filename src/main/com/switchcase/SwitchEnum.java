package main.com.switchcase;

import java.util.*;
public class SwitchEnum
{
    
        enum course 
        {
            AI,ML,WD
            
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        course[] presentcourse = course.values();    
        
       for(course c:presentcourse)
       {
           switch(c)
           {
               case AI:
                    System.out.println("The full form of AI is Artificial Intelligence");
                    break;
               case ML:
                   System.out.println("Full form of ML is Machine Learning");
                   break;
                case WD:
                    System.out.println("The full form of WD is Web Development");
                    break;
                    
           }
           
       }
    }
}