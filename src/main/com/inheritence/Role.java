package main.com.inheritence;

class Intern
{
    String name="Arka Ghosh";
}
public class Role extends Intern
{
    String Job="Technical Writer";
    String Lang="JAVA";
    public static void main(String[] args)
    {
        Role t=new Role();
        System.out.println("Intern Name: "+t.name);
        System.out.println("Intern Role: "+t.Job+" in "+t.Lang);
    }
}