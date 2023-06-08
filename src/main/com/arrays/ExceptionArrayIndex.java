package main.com.arrays;

class ExceptionArrayIndex {
  public static void main(String[] args) {
    int arr[] = new int[] {
      1,
      2,
      3,
      4,
      5
    };
    int j;
    for (j = 0; j <= arr.length; j++) {
      System.out.println(arr[j]);
    }
  }
}