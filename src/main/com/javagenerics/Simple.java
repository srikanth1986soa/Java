package main.com.javagenerics;

class GenericTypeClass<T extends Number>
{
    //This is a class where you can only use generic objects of classes
    //which are a subclass of Number that is Integer, Float etc. 
    GenericTypeClass(T obj)
    {
        System.out.println(obj.getClass().getName());
        
    }
}
public class Simple{
public static void main(String[]args)
    {
    Integer a = 10;
    GenericTypeClass<Integer> obj = new GenericTypeClass<>(a);
    String s="DataFlair";
    //GenericTypeClass<String> obj2=new GenericTypeClass<>(a);
    
     }
}