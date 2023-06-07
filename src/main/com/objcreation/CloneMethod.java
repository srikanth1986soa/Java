package main.com.objcreation;

public class CloneMethod implements Cloneable
{
  @Override
  protected Object clone() throws CloneNotSupportedException
  {
    return super.clone();
  }
  String name = "DataFlair";
  public static void main(String[] args)
  {
    CloneMethod obj1 = new CloneMethod();
    try
    {
      CloneMethod obj2 = (CloneMethod) obj1.clone();
      System.out.println(obj2.name);
    }
    catch (CloneNotSupportedException e)
    {
      e.printStackTrace();
    }
  }
}