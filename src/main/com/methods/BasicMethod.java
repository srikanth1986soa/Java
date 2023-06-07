package main.com.methods;

public class BasicMethod {
  public static void getminimum(int a, int b) {
    if (a < b) System.out.println(a + " is the minimum of the two.");
    else if (b < a) System.out.println(b + " is the minimum of the two.");
    else System.out.println("both the numbers are equal");
  }
  public static void main(String[] args) {
    getminimum(5, 6);
  }
}