package main.com.assertionsinjava;

public class AssertTest
{
    public static void main(String[] args) {
        int a=20;
        assert a>=30:"Wrong Value";
        System.out.println("This statement will execute only if the value of a is greater than or equal to 30 ");
    }
}