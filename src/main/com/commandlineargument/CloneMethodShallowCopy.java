package main.com.commandlineargument;

class Test1
{
  int variable1, variable2;
}
class Test2 implements Cloneable
{
  int testVar1;
  int testVar2;
  Test1 testObject = new Test1();
  public Object clone() throws
  CloneNotSupportedException
  {
    return super.clone();
  }
}
public class CloneMethodShallowCopy {
  public static void main(String args[]) throws
  CloneNotSupportedException
  {
    Test2 testObject1 = new Test2();
    testObject1.testVar1 = 10;
    testObject1.testVar2 = 20;
    testObject1.testObject.variable1 = 30;
    testObject1.testObject.variable2 = 40;
    Test2 testObject2 = (Test2)testObject1.clone();
    testObject2.testVar1 = 100;
    testObject2.testObject.variable1 = 300;
System.out.println(testObject1.testVar1 + " " + testObject1.testVar2 + " " +
    testObject1.testObject.variable1 + " " + testObject1.testObject.variable2);
System.out.println(testObject2.testVar1 + " " + testObject2.testVar2 + " " +
    testObject2.testObject.variable1 + " " + testObject2.testObject.variable2);
  }
}