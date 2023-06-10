package main.com.arrays;

public class BasicArray {
  public static void main(String[] args) {
    System.out.println("This program illustrates declaration and use of java arrays");
    int i;
    //Declaring array literal
    int arr_lit[] = new int[] {
      69,
      666,
      420,
      117
    };
    //Declaring array object
    int arr_obj[] = new int[6];
    //Using for loop to access elements in arr_obj
    for (i = 0; i < 6; i++) {
      arr_obj[i] = i;
    }
    //using for each loop to iterate through arr_lit
    System.out.println("The array literal has values");
    for (int j: arr_lit) {
      System.out.print(j + " ");
    }
    System.out.println("");
    //using for loop to iterate over each element in arr_obj
    System.out.println("The array object has values:-");
    for (i = 0; i < 6; i++) {
      System.out.print(arr_obj[i] + " ");
    }
    //we go from 0 to the number before the length of the array
    //because arrays are indexed from 0 to n-1
    //n is the size of the array
  }
}