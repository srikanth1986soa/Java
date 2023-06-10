package main.com.polymorphism;

public class StaticBinding {
  public void staticbind() {
    System.out.println("This is static binding");
  }
  public static void main(String[] args) {
    StaticBinding sb = new StaticBinding();
    sb.staticbind();
    System.out.println("Static binding occurred.");
  }
}