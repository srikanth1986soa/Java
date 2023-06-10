package main.com.javamethodoverriding;

class GrandFather {
  void move() {
    System.out.println("I use my stick to move!");
  }
}
class Father extends GrandFather {
  void move() {
    System.out.println("I can walk fast!");
  }
}
class Baby extends Father {
  void move() {
    System.out.println("I crawl and have fun!");
  }
  public static void main(String[] args) {
    GrandFather ob = new Baby();
    ob.move();
  }
}