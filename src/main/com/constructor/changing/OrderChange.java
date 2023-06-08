package main.com.constructor.changing;



class OrderChange
{
    OrderChange()
    {
        System.out.println("default");
    }
    OrderChange(int x)
    {
        this();
        System.out.println(x);
    }
    OrderChange(int x, int y)
    {
        this(5);
        System.out.println(x * y);
    }
    public static void main(String args[])
    {
        new OrderChange(8, 10);
    }
}
