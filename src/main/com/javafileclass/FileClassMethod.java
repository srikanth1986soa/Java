package main.com.javafileclass;

import java.io.File;
public class FileClassMethod {
  public static void main(String[] args) {
    File f = null;
    String[] strs = {
      "java1.txt",
      "java2.txt",
      "java3.txt",
      "DataFlair.txt"
    };
    try {
      //String arrays store the strings for easy conversion to file objects. 
      for (String s: strs) {
        // create a new file with the name from the lists.
        f = new File(s);
        // stores true if executable, else stores false.
        boolean bool = f.canExecute();
        // stores the absolute path of the file in the variable. 
        String a = f.getAbsolutePath();
        //Now we print the absolute path of the variable.
        System.out.println(a + " executable? " + bool);
      }
    } catch(Exception e) {
      // if any I/O error occurs
      e.printStackTrace();
    }
  }
}