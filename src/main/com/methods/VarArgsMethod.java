package main.com.methods;

public class VarArgsMethod {
  static void printnum(int...numbers) {
    if (numbers.length == 0) System.out.println("There are no numbers");
    else {
      System.out.println("The numbers are");
      for (int i = 0; i < numbers.length; i++) {
        System.out.println(numbers[i]);
      }
    }
  }
  public static void main(String[] args) {
    printnum(1, 2, 3, 4, 5, 21, 56, 67, 56, 5, 56, 5, 34, 63, 453, 52345);
  }
}