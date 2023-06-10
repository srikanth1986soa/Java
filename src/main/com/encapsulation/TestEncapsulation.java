package main.com.encapsulation;

public class TestEncapsulation {
  private String privateVar;
  TestEncapsulation() {
    privateVar = "java";
  }
}
public class PrivateVariables {
  public static void main(String[] args) {
    System.out.println(TestEncapsulation.privateVar);
  }
}