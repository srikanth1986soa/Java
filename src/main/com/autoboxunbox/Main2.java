package main.com.autoboxunbox;

public class Main2
{
    public static void conv(float f)
    {
        System.out.println("The function with widened parameter got executed");
    }
    public static void conv(Float... f)
    {
        System.out.println("The function with variable arguments got executed");
    }
    public static void main(String[] args) {
        int a=9;
        conv(a);
    }
}