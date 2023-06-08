package main.com.arrays;

class AnonymousArray {
  static void printArray(int arr[]) {
    for (int i: arr) {
      System.out.println(i);
    }
  }
  public static void main(String[] args) {
    printArray(new int[] {
      1,
      2,
      3,
      4,
      5,
      0
    });
  }
}