package main.com.constructors;

public class Default
{
    int defaultvalueint;
    String defaultString;
    public static void main(String[] args) {
        System.out.println("This is the default constructor at work. ");
        Default object = new Default();//We called the default constructor here
        System.out.println("The default values of int data type is "+object.defaultvalueint);
        System.out.println("The default values of the String data type is "+object.defaultString);

    }
}