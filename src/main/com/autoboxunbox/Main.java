package main.com.autoboxunbox;

public class Main
{
    public static void conv(Float f)
    {
        System.out.println("The value got converted to its wrapper class.");
    }
    public static void conv(float f)
    {
        System.out.println("The value got converted to a wider primitive datatype");
    }
    public static void main(String[] args) {
        int a=9;
        conv(a);
    }
}