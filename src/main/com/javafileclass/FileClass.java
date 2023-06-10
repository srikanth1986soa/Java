package main.com.javafileclass;

import java.io. * ;
public class FileClass {
  public static void main(String[] args) {
    try {
      File f = new File("DataFlair.txt");
      if (f.createNewFile()) {
        System.out.println("New File created!");
      } else {
        System.out.println("The file already exists.");
      }
    } catch(IOException e) {
      e.printStackTrace();
    }
  }
}