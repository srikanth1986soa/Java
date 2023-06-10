package main.com.autoboxunbox;

public class Main1
{
    public static void conv(Float f)
    {
        System.out.println("The function with the single parameter got executed");
    }
    public static void conv(Float... f)
    {
        System.out.println("The function with variable arguments got executed");
    }
    public static void main(String[] args) {
        float a=9;
        conv(a);
    }
}