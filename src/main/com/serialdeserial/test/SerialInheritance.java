package main.com.serialdeserial.test;

import java.io. * ;
class ParentClass {
  int variable1,
  variable2;
  ParentClass() {
    this.variable1 = 50;
    this.variable2 = 60;
  }
}
public class SerialInheritance
{
  public static void main(String[] args) throws IOException {
    //This class can also have serialization and deserialization methods inside it even if it does not implement the Serializable interface. 
    try {
      int arr[] = new int[50];
      ParentClass parentclassob = new ParentClass();
      //Creating stream and writing the object  
      FileOutputStream fout = new FileOutputStream("file.txt");
      ObjectOutputStream out = new ObjectOutputStream(fout);
      out.writeObject(arr);
      out.flush();
      //closing the stream  
      out.close();
      System.out.println("This class can implement the Serializable interface!!");
    }
    catch(Exception e) {
      System.out.println(e);
    }
  }