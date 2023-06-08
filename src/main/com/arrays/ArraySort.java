package main.com.arrays;

import java.util.Arrays;
import java.util.Collections;

class ArraySort {
  public static void main(String[] args) {
    Integer arr1[] = {
      3,
      2,
      1,
      4,
      5
    };
    Integer arr2[] = {
      6,
      4,
      32,
      2,
      1
    };
    Arrays.sort(arr1);
    Arrays.sort(arr2, Collections.reverseOrder());
    //we are using Integer instead of int because Collections does not work with primitive datatypes.
    System.out.println("The array arr1 in ascending order is " + Arrays.toString(arr1));
    System.out.println("The array arr2 in descending order is " + Arrays.toString(arr2));
  }
}