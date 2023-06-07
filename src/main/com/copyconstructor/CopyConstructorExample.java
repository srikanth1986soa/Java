package main.com.copyconstructor;

class ComplexNumber
{
  private double realNumber, imaginaryNumber;
  public ComplexNumber(double realNumber, double imaginaryNumber) 
  {
    this.realNumber = realNumber;
    this.imaginaryNumber = imaginaryNumber;
  }
  ComplexNumber(ComplexNumber copy) 
  {
    System.out.println("Copy constructor called");
    realNumber = copy.realNumber;
    imaginaryNumber = copy.imaginaryNumber;
  }
  @Override
  public String toString() 
  {
    return "(" + realNumber + " + " + imaginaryNumber + "i)";
  }
}
public class CopyConstructorExample 
{
  public static void main(String[] args) {
    ComplexNumber ComplexNumberObject1 = new ComplexNumber(5, 10);
    ComplexNumber ComplexNumberObject2 = new ComplexNumber(ComplexNumberObject1);
    ComplexNumber ComplexNumberObject3 = ComplexNumberObject2;
    System.out.println(ComplexNumberObject2);
  }
}