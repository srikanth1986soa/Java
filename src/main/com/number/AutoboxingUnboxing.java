package main.com.number;

public class AutoboxingUnboxing {
  public static void main(String[] args) {
    System.out.println("Understanding Autoboxing");
    //This is a primitive datatype
    Integer i = 10;
    //Autoboxing of the primitive value 10 to an object
    System.out.println("The integer is " + i);
    System.out.println("Understanding Unboxing");
    Integer num = new Integer(98);
    int unboxnum = num;
    //Unboxing of the num object to a primitive datatype int
    System.out.println("The value of the integer is " + unboxnum);
  }
}