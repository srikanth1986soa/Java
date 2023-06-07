package main.com.constructors;

public class Parameterised {

    int defaultvalueint;
    String defaultString;
    Parameterised(int val, String value)
    {
        System.out.println("This is the parameterized constructor");
        defaultString=value;
        defaultvalueint=val;
    }
    public static void main(String[] args) {
        Parameterised object = new Parameterised(52,"DataFlair");//We called the default constructor here
        System.out.println("The default values of int data type is "+object.defaultvalueint);
        System.out.println("The default values of the String data type is "+object.defaultString);
    }
}
