package main.com.polymorphism;

public class Polymorphism
{
    void area(int r)
    {
        double a=3.14*r*r;
        System.out.println("The area of the Circle is: "+a);
    }
    void area(int l, int b)
    {
        int a= l*b;
        System.out.println("The area of the rectangle is: "+a);
    }
    public static void main(String[] args)
    {
        Polymorphism a = new Polymorphism();
        a.area(5);
        a.area(2,3);
    }
}