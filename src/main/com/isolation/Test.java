package main.com.isolation;

public class Test
{
    Test i;
    public staticvoid main(String[] args) 
    {
        Test t1 = new Test();
        Test t2 = new Test();
        t1.i = t2;
        t2.i = t1;
        t1 = null;
        t2 = null;
        System.gc();
    }
    @Override
    protected void finalize() throws Throwable
    {
        System.out.println("Finalize method called");
    }
}