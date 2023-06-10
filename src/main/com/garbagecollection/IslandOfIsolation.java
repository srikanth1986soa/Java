package main.com.garbagecollection;

class Human
{
    @Override
    protected void finalize() throws Throwable
    {
        System.out.println("Garbage collector in action! Deleted one object!");
    }
    String name;
    Human(String name)
    {
        this.name=name;
    }
}
public class IslandOfIsolation 
{
   
    public static void main(String[] args) {
        Human human1 = new Human("Shraman");
        Human human2 = new Human("Debanjan");
        human1.name=human2.name;
        human2.name=human1.name;
        human1=null;//Nullifying the first object
        human2=null;//nullifying the second object. 
        System.gc();//calling the garbage collector. 
    }
}