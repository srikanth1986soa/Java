package main.com.javafileclass;

import java.io. * ;
public class CheckDirectory {
  public static void main(String[] args) {
    //We initialize the file constructor with valid directories or files. 
    File file = new File("C:/internshipDF/");
    System.out.println("Is this a directory? : " + file.isDirectory());
    File file2 = new File("D:/internshipDF/newfile.txt");
    System.out.println("Is this a directory? : " + file2.isDirectory());
  }
}