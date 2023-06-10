package main.com.arrays;

import java.util.Arrays;
class Equals {
  public static void main(String[] args) {
    Integer arr1[] = new Integer[] {
      1,
      2,
      3,
      4,
      5
    };
    Integer arr2[] = new Integer[] {
      1,
      2,
      3,
      4,
      5
    };
    System.out.println("Is arr1 and arr2 equal? " + Arrays.equals(arr1, arr2));
    System.out.println("Is arr1 and arr2 equal? " + Arrays.deepEquals(arr1, arr2));
    Integer mat1[][] = new Integer[][] {
      {
        1,
        2,
        3
      },
      {
        4,
        5,
        6
      },
      {
        7,
        8,
        9
      }
    };
    Integer mat2[][] = new Integer[][] {
      {
        1,
        2,
        3
      },
      {
        4,
        5,
        6
      },
      {
        7,
        8,
        9
      }
    };
    System.out.println("Is mat1 and mat2 equal? " + Arrays.equals(mat1, mat2));
    System.out.println("Is mat1 and mat2 equal? " + Arrays.deepEquals(mat1, mat2));
  }
}