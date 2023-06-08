package main.com.constructor.changing;

class Base
{
    String name;
    Base()
    {
        this("");
        System.out.println("No-argument constructor of" +
                " base class");
    }
    Base(String name)
    {
        this.name = name;
        System.out.println("Calling parameterized constructor"
                + " of base");
    }
}
class UsingSuper extends Base
{
    UsingSuper()
    {
        System.out.println("No-argument constructor " +
                "of derived");
    }
    UsingSuper(String name)
    {
        super(name);
        System.out.println("Calling parameterized " +
                "constructor of derived");
    }
    public static void main(String args[])
    {
        UsingSuper obj = new UsingSuper("test");
    }
}