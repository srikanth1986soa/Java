package main.com.constructors;

public class NoParameters {

    int defaultvalueint;
    String defaultString;
    NoParameters()
    {
        System.out.println("This is the default constructor... It doesn’t do much except assigning default values to class variables.");
    }
    public static void main(String[] args) {
        NoParameters object = new NoParameters();//We called the default constructor here
        System.out.println("The default values of int data type is "+object.defaultvalueint);
        System.out.println("The default values of the String data type is "+object.defaultString);
    }
}
