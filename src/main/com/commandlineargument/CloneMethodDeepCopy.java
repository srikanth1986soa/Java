package main.com.commandlineargument;

class Demo
{
  int variable1, variable2;
}
class Demo1 implements Cloneable
{
  int testVar1, testVar2;
  Demo testVar3 = new Demo();
  public Object clone() throws
  CloneNotSupportedException
  {
    Demo1 t = (Demo1)super.clone();
    t.testVar3 = new Demo();
    return t;
  }
}
public class CloneMethodDeepCopy {
  public static void main(String args[]) throws
  CloneNotSupportedException
  {
    Demo1 demoObj1 = new Demo1();
    demoObj1.testVar1 = 10;
    demoObj1.testVar2 = 20;
    demoObj1.testVar3.variable1 = 30;
    demoObj1.testVar3.variable2 = 40;
    Demo1 demoObj2 = (Demo1)demoObj1.clone();
    demoObj2.testVar1 = 100;
    demoObj2.testVar3.variable1 = 300;
    System.out.println(demoObj1.testVar1 + " " + demoObj1.testVar2 + " " +
        demoObj1.testVar3.variable1 + " " + demoObj1.testVar3.variable2);
    System.out.println(demoObj2.testVar1 + " " + demoObj2.testVar2 + " " +
        demoObj2.testVar3.variable1 + " " + demoObj2.testVar3.variable2);
  }
}