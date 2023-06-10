package main.com.javamethodoverriding;

class Father {
  void shoot() {
    System.out.println("I am the father! I am a right-handed shooter! ");
  }
}
public class Child extends Father {
  void shoot() {
    super.shoot(); //This super keyword calls the method with the same name in the parent class. 
    System.out.println("I am the son! I am a left-handed shooter!");
  }
  public static void main(String[] args) {
    Father fc = new Child();
    fc.shoot(); //This is the method which houses the super keyword for calling the parent class method. 
  }
