package main.com.constructors;

public class ConstructorChaining {
    ConstructorChaining()
    {
        this(100);
        //call made to constructor with one parameter of type int
        System.out.println("This is the default constructor ");
    }
    ConstructorChaining(int x)
    {
        this(x,"DataFlair");
        //constructor call made with two parameters. 
        System.out.println("This is a parameterized constructor");
    }
    ConstructorChaining(int x, String s)
    {
        System.out.println(s+" "+x);
        System.out.println("This is the final constructor call. ");
    }
        public static void main(String[] args) {
            ConstructorChaining object = new ConstructorChaining();
            
            
        }
}