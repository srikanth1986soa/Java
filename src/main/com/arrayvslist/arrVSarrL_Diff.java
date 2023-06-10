package main.com.arrayvslist;

public class arrVSarrL_Diff
{
   public static void main(String args[]) {
    //Creating and Initializing a Normal Array
    int[] arrN = new int[5];
    arrN[0] = 1;
    arrN[1] = 2;
    arrN[2] = 3;
    arrN[3] = 4;
    arrN[4] = 5;
    //Accessing Array elements
    System.out.println("The first element of Array is: " + arrN[0]);
    System.out.println("The second element of Array is: " + arrN[1]);        
    //Creating an ArrayList with capacity 5 
    ArrayList < Integer > arrL = new ArrayList < Integer > (5);
    // Add elements to ArrayList 
    arrL.add(1);
    arrL.add(2);
    arrL.add(3);
    arrL.add(4);
    arrL.add(5);
    // Accessing the  elements of ArrayList 
    System.out.println("The first element of ArrayList is: " + arrL.get(0));
    System.out.println("The second  element of ArrayList is: " + arrL.get(1));
  }
}