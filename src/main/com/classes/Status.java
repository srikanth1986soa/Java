package main.com.classes;

abstract class Abstractions
{
    abstract void success();
}
public class Status extends Abstractions{
    void success(){
        System.out.println("You Have Successfully Applied for the Internship!");
    }
    public static void main(String[] args){
        Abstractions obj = new Status();
        obj.success();
    }
}