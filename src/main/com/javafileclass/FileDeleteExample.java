package main.com.javafileclass;

import java.io. * ;
public class FileDeleteExample {
  public static void main(String[] args) {
    // initialize File constructor
    File file = new File("C:/internshipDF/File Class/java1.txt");
    //This boolean variable stores the result of the delete operation. 
    boolean delete = file.delete();
    if (delete) {
      System.out.println("The file is no more. ");
    } else {
      System.out.println("The file was not found!");
    }
  }
}