package main.com.javagenerics;

import java.io.*;
import java.util.*;
class GenericClass<T>
{
    //This is a generic class definition. The type is T as mentioned. 
    GenericClass()
    {
        System.out.println("The generic class is declared now. You can use it well");
    }
    public void methodgeneric(T obj)
    {
        System.out.println("The type of the object that this class now contains is "+obj.getClass().getSimpleName());
    }
}
public class GenericsExample {
    public static void main(String[] args) {
        
        GenericClass<Integer> test=new GenericClass<>();
        Integer a=5;
        test.methodgeneric(a);
        //Now we use the same class but with a different datatype. 
        
        GenericClass<String> teststring = new GenericClass<>();
        String s="DataFlair is the best";
        teststring.methodgeneric(s);
    }    
}