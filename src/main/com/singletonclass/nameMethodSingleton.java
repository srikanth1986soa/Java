package main.com.singletonclass;

class Singleton1
{
  // static variable single_instance of type Singleton1
  private static Singleton1 single_instance=null;
  public String str;
   private Singleton1()
   {
     str = "Welcome to DataFlair";
    }
  public static Singleton1 Singleton1()
  {
    if (single_instance == null)
    {
     single_instance = new Singleton1();
    }
   return single_instance;
   }
}
public class nameMethodSingleton {
public static void main(String args[])
   {
     Singleton1 text = Singleton1.Singleton1();
     Singleton1 text1 = Singleton1.Singleton1();
     //text in upper case
     text.str = (text.str).toUpperCase();
     System.out.println("String in Upper Case " + text.str);
     System.out.println("");
     //text in lower case
     text1.str = (text1.str).toLowerCase();
     System.out.println("String in Lower Case " + text1.str);
   }
}