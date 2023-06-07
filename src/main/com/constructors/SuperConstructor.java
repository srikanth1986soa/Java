package main.com.constructors;

class A
{
    A()
    {
        System.out.println("This is the constructor of class A");
    }
}
class B extends A
{
    B()
    {
        super();
        System.out.println("This is the constructor of class B");
    }
}
public class SuperConstructor {
    public static void main(String[] args) {
        
        B ob = new B();
    }
}