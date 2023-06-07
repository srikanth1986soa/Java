package main.com.loops;

public class NestedLoop {
  public static void main(String[] args) {
    int i,
    j,
    k;
    k = 0;
    for (i = 0; i < 6; i++) {
      for (j = 0; j < 6; j++) {
        System.out.print(k + "\t");
        k++;
      }
      System.out.println("");
    }
  }
}