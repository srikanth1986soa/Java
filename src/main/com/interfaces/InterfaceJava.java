package main.com.interfaces;

interface InterfaceJava {
  void run();
  static void StaticMethod() //static method
  {
    System.out.println("This is a static method");
  }
default void sleep() //default method
  {
    System.out.println("Both humans and dogs love to sleep");
  }
}
class Dog implements InterfaceJava {
  public void run() {
    System.out.println("A dog runs with the help of four legs");
  }
}
class Human implements InterfaceJava {
  public void run() {
    System.out.println("A human runs with the help of two legs");
  }
}
class Interface {
  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.run();
    Human human = new Human();
    human.run();
    InterfaceJava.StaticMethod();
    human.sleep();
  }
}