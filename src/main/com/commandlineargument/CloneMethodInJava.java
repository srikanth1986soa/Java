package main.com.commandlineargument;

class Test
{
  int variable1, variable2;
  Test()
  {
    variable1 = 10;
    variable2 = 20;
  }
}
public class CloneMethodInJava 
{
  public static void main(String[] args)
  {
    Test ob1 = new Test();
    System.out.println(ob1.variable1 + " " + ob1.variable2);
    Test ob2 = ob1;
    ob2.variable1 = 100;
    System.out.println(ob1.variable1+" "+ob1.variable2);
    System.out.println(ob2.variable1+" "+ob2.variable2);
  }
}