package main.com.constructors;

class AB
{
    AB()
    {
        System.out.println("This is the default constructor");
    }
    AB(int a)
    {
        System.out.println("This constructor consists of a single parameter of value "+a);
    }
    AB(int a, String s)
    {
        System.out.println("This constructor consists of two parameters of values "+a+", "+s);
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {

        AB obj=new AB();
        AB obj1=new AB(5,"DataFlair");
    }
    
}