package main.com.arrays;

import java.util.Arrays;

class BinarySearchMethod {
  public static void main(String[] args) {
    int newarr[] = new int[] {
      1,
      2,
      3,
      4,
      5
    };
    int search = 3;
    System.out.println("The array, when passed to the binarySearch method, is: " + Arrays.binarySearch(newarr, search));
  }
}