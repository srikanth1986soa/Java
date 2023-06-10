package main.com.fi;

class Test2
{
public static void main(String args[])
{
// lambda expression
new Thread(()->
{System.out.println("New thread created");}).start();
}
}