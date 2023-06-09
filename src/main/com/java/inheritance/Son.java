package main.com.java.inheritance;

class Father {
  String familyName;
  String houseaddress;
  Father() {
    familyName = "Programmer";
    houseaddress = "Delhi";
  }
}
public class Son extends Father2 {
  String name;
  Son() {
    name = "Shraman";
  }
  void printdetails() {
    System.out.println("Hey my name is " + this.name + " " + this.familyName + " and I am from " + this.houseaddress);
  }
  public static void main(String[] args) {
    SonTest s1 = new SonTest();
    s1.printdetails();
  }
}