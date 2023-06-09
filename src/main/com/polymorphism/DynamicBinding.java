package main.com.polymorphism;

class Dynamic {
  public void dynamicbind() {
    System.out.println("Original method dynamic bind of type Dynamic. ");
  }
}
public class DynamicBinding extends Dynamic {
  public void dynamicbind() {
    System.out.println("This is Dynamic Binding");
  }
  public static void main(String[] args) {
    DynamicBinding db = new DynamicBinding();
    db.dynamicbind();
  }
}