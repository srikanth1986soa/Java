package main.com.arrays;

public class PassReturnArrayToMethod {
  static int[] increment1(int arr[]) {
    int i;
    for (i = 0; i < arr.length; i++) {
      arr[i] = arr[i] + 1;
    }
    return arr; //returning array from method. 
  }
  public static void main(String[] args) {
    int orgarray[] = new int[] {
      1,
      2,
      3,
      4,
      5
    }; //original array
    int retarray[] = increment1(orgarray); //passing array to method
    System.out.println("The array when incremented by 1 becomes: ");
    for (int i: retarray) {
      System.out.print(i + " ");
    }
  }
}