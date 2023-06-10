package main.com.serialdeserial.testmine;

import java.io. * ;
class TestSerializeDeserialize implements Serializable {
  private static final long serialversionUID = 65421233l; //Random value for SerialUID
  transient int transvar;
  static int staticvar;
  int normalvar;
  public TestSerializeDeserialize(int transvar, int staticvar, int normalvar) {
    this.transvar = transvar;
    TestSerializeDeserialize.staticvar = staticvar;
    this.normalvar = normalvar;
  }
}
public class SerializationAndDeserialization {
  //We now declare a method which will print all the data in the previous class
  public static void printdetails(TestSerializeDeserialize obj) {
    System.out.println("The transient variable has a value equal to " + obj.transvar);
    System.out.println("The static variable has a value equal to " + obj.staticvar);
    System.out.println("The normal variable has a value equal to " + obj.normalvar);
  }
  public static void main(String[] args) {
    TestSerializeDeserialize object = new TestSerializeDeserialize(123, 143, 1000);
    String filename = "Serialization.txt";
    try {
      FileOutputStream file = new FileOutputStream(filename);
      ObjectOutputStream out = new ObjectOutputStream(file);
      //now we serialize the object
      out.writeObject(object);
      out.close();
      file.close();
      //Now we shall see how our data looked before serialization
      System.out.println("Serialization performed on the object. Let us see what our data looked like before serialization");
      printdetails(object);
      object.staticvar = 453;
    }
    catch(IOException IOE) {
      System.out.println("IOException caught ->" + IOE.getMessage());
    }
    //We know that the writeObject can throw IOException hence we handle that
    object = null; //resetting the object
    //Now we get to deserialization
    try {
      FileInputStream file = new FileInputStream(filename);
      ObjectInputStream in =new ObjectInputStream(file);
      //Method for deserialization of object
      object = (TestSerializeDeserialize) in .readObject();
      in .close();
      file.close();
      System.out.println("\nThe Object is now deserialized");
      System.out.println("\nThe data after deserialization\n");
      printdetails(object);
    }
    catch(IOException IOE) {
      System.out.println("IOException caught ->" + IOE.getMessage());
    }
    catch(ClassNotFoundException CNFE) {
      System.out.println("ClassNotFoundException caught ->" + CNFE.getMessage());
    }
  }
}