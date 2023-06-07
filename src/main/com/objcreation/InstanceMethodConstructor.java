package main.com.objcreation;

import java.lang.reflect.*;
public class InstanceMethodConstructor
{
  private String name;
  public void Name(String name)
  {
    this.name = name;
  }
  public static void main(String[] args)
    {
    try
    {
      Constructor<InstanceMethodConstructor> constructor = InstanceMethodConstructor.class.getDeclaredConstructor();
      InstanceMethodConstructor obj = constructor.newInstance();
      obj.Name("DataFlair");
      System.out.println(obj.name);
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
}