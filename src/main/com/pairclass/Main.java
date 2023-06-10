package main.com.pairclass;

class Pair
{
    int value1;
    int value2;
    Pair(int a, int b)
    {
        value1=a;
        value2=b;
        
    }
    
}
public class Main
{
    public static void main(String[] args) {
        //Here is an example of how you can set up your own pair class in java.
        Pair b = new Pair(3,4);
        //add methods to the class as you like.
        //You can also make it generic in nature!
        System.out.println("Example of custom pair class in Java.");
        System.out.println("The Pair is <"+b.value1+","+b.value2+">");
    }
}