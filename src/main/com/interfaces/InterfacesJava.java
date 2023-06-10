package main.com.interfaces;

interface ShootType {
  //This interface houses all the methods which will be implemented in the program. 
  public void shoot();
}
class Father implements ShootType {
  public void shoot() {
    //First implementation of the method shoot()
    System.out.println("I am the father and I shoot with my right hand!");
  }
}
class Son implements ShootType {
  public void shoot() {
    //second implementation of the method shoot. 
    System.out.println("I am the son. My father uses the right hand to shoot. I use my left hand to shoot!");
  }
}
public class InterfacesJava {
  public static void main(String[] args) {
    Father f = new Father();
    Son s = new Son();
    f.shoot();
    s.shoot();
  }
}