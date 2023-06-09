package main.com.javafileclass;

import java.io. * ;
public class AbsoluteCanonicalPath {
  public static void main(String[] args) throws IOException {
    File file = new File("C:/internshipDF/File Class/javafileclass.txt");
    //After we create a file object we pass it through the methods as shown below. 
    System.out.println("Absolute Path : " + file.getAbsolutePath());
    System.out.println("Canonical Path : " + file.getCanonicalPath());
  }
}