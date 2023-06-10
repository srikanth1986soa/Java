package main.com.keyword;

class Person
{
  void message()
  {
    System.out.println("This is person class");
  }
}
class Student extends Person
{
  void message()
  {
    System.out.println("This is student class");
  }
  void display()
  {
    message();
    super.message();
  }
}
public class SuperWithMethods {
  public static void main(String args[])
  {
    Student studentObject = new Student();
    studentObject.display();
  }
}