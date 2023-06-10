package main.com.encapsulation;

class TestEncapsulation {
  private String privateVar;
  TestEncapsulation() {
    privateVar = "java";
  }
  public void getVariable() {
    System.out.println(privateVar);
  }
  public void setVariable(String setvalue) {
    privateVar = setvalue;
  }
}
public class PrivateVariables {
  public static void main(String[] args) {
    TestEncapsulation test = new TestEncapsulation();
    test.setVariable("Python");
    test.getVariable();
    //System.out.println(TestEncapsulation.privateVar);  
  }
}