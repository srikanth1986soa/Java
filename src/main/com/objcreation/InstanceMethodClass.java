package main.com.objcreation;

public class InstanceMethodClass {
  String name = "DataFlair";

  public static void main(String[] args) {
    try {
      Class obj1 = Class.forName("com.DataFlair.ObjectCreation.InstanceMethodClass");
      InstanceMethodClass obj = (InstanceMethodClass) obj1.newInstance();
      System.out.println(obj.name);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}