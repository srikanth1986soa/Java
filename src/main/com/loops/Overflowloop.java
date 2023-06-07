package main.com.loops;

import java.util. * ;
public class Overflowloop {
  public static void main(String[] args) {
    int i;
    ArrayList < Integer > ar = new ArrayList < >();
    try {
      for (i = 0; i <= Integer.MAX_VALUE; i++) {
        ar.add(i);
      }
    } catch(Exception e) {
      //TODO: handle exception
      System.out.println(e);
    }
  }
}