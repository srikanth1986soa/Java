package main.com.arrays;

class CloningArrays {
  public static void main(String[] args) {
    int newarr[] = new int[] {
      1,
      2,
      3,
      4,
      5
    };
    int clonearr[] = newarr.clone();
    for (int i: clonearr) {
      System.out.println(i);
    }
    System.out.println("Check if references are equal");
    System.out.println(clonearr == newarr);
    //cloning multidimensional arrays
    int multnew[][] = new int[][] {
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
    int clonemult[][] = multnew.clone();
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(clonemult[i][j] + " ");
      }
      System.out.println("");
    }
    System.out.println("Check if references to the outer array are the same. ");
    System.out.println(multnew == clonemult);
    System.out.println("Check if references of the inner array are the same. ");
    System.out.println(multnew[0] == clonemult[0]);
  }
}