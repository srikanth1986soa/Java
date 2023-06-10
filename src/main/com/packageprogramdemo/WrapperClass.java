package main.com.packageprogramdemo;

public class WrapperClass {
  public static void main(String[] args)
  {
    Integer operand1 = new Integer(10);
    Integer operand2 = new Integer(20);
    Integer operand3 = new Integer(30);
    Integer operand4 = new Integer(operand1.intValue() + operand2.intValue()+ operand3.intValue());
    System.out.println("Addition of three numbers is : "+ operand4);
  }
}