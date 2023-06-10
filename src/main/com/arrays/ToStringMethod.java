package main.com.arrays;

import java.util.Arrays;

class ToStringMethod {
  public static void main(String[] args) {
    int newarr[] = new int[]{
            1,
            2,
            3,
            4,
            5
    };
    System.out.println("The array, when passed to the toString method, is: " + Arrays.toString(newarr));
  }
}