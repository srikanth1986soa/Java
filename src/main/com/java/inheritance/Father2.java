package main.com.java.inheritance;

class Father2 {
  String familyName;
  String houseaddress;
  Father2() {
    familyName = "Programmer";
    houseaddress = "Delhi";
  }
}
class SonTest extends Father2 {
  SonTest() {
    System.out.println("I am the Son");
    System.out.println("My family name is " + this.familyName + " and I am from " + this.houseaddress);
  }
}
class Daughter extends Father2 {
  Daughter() {
    System.out.println("I am the Daughter");
    System.out.println("My family name is " + this.familyName + " and I am from " + this.houseaddress);
  }
}
class MainTest {
  public static void main(String[] args) {
    SonTest s = new SonTest();
    Daughter d = new Daughter();
  }
}