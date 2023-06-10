package main.com.javamethodoverriding;

class Calculator
{
  void addition(int operand1, int operand2)
  {
    System.out.println(operand1+operand2); 
  }
  void  addition(String alphabet)  
  {
    System.out.println(alphabet); 
  }
}
public class CompileTimePolymorphism
{
  public static void main(String args[])
  {
    Calculator obj = new Calculator();
    obj.addition(10, 20);
    obj.addition("DataFlair");
  }
}