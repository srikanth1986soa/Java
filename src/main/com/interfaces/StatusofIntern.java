package main.com.interfaces;

interface Intern
{
    void print();
}
public class StatusofIntern implements Intern{
    public void print(){System.out.println("You Have Successfully Applied for the Internship!");
    }
    public static void main(String args[]){
        StatusofIntern obj = new StatusofIntern();
        obj.print();
    }
}