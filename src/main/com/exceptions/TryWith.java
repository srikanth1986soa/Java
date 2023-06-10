package main.com.exceptions;

import java.io. * ;
class TryWith {
  public static void main(String[] args) {
    try (FileReader fr = new FileReader("C://internshipDF//exceptionjava//DataFlairJava.txt")) {
      char[] a = new char[50];
      fr.read(a); // Feed the characters to the array
      for (char c: a)
      System.out.print(c); //prints all the characters one by one. 
    } catch(IOException e) {
      e.printStackTrace();
    }
  }
}