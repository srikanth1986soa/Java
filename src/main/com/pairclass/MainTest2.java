package main.com.pairclass;

import javafx.util.Pair;
import java.util.*;
public class MainTest2
{
    public static Pair pairfunc(String firstname,String lastname)
    
    {
        Pair<String,String> name = new Pair<>(firstname,lastname);
        
        return name;
    
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name");
        String fname=sc.nextLine();
        System.out.println("Enter your last name");
        String lname=sc.nextLine();
        Pair result=pairfunc(fname,lname);
        System.out.println("Hi there "+ result.getKey()+" "+result.getValue());
        
        
    }
}