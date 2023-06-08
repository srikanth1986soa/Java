package main.com.arrays;

import java.util.Arrays;
class FillMethod {
  public static void main(String[] args) {
    int newarr[] = new int[] {
      1,
      2,
      3,
      4,
      5
    };
    Arrays.fill(newarr, 54);
    System.out.println("The array, when passed to fill method, is: " + Arrays.toString(newarr));
  }
}