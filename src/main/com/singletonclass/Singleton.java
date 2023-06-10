package main.com.singletonclass;

class Singleton
  { 
    private static Singleton single_instance = null;
    public String str;
    private Singleton()
      {
     str = "Hello Readers!, Welcome to DataFlair's Tutorial of Java";
    }
    public static Singleton getInstance()
    {
     if (single_instance == null)
     single_instance = new Singleton();
     return single_instance;
    }
  }
 class getInstanceMethodDemo
  {
     public static void main(String args[])
     {
    Singleton text1 = Singleton.getInstance();
    Singleton text2 = Singleton.getInstance();
    //text in upper case
    System.out.println("In Upper Case : ");
    text1.str = (text1.str).toUpperCase();
    System.out.println("String from text1 is " + text1.str);
    //text in lower case
    System.out.println("In Lower Case : ");
    text2.str = (text2.str).toLowerCase();
    System.out.println("String from text1 is " + text2.str);
     }
  }