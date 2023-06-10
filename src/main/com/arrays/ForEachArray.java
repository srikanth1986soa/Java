package main.com.arrays;

class ForEachArray {
  public static void main(String[] args) {
    int arr[] = new int[] {
      1,
      2,
      3,
      4,
      5
    };
    for (int i: arr) {
      System.out.println(i);
    }
  }
}