package main.com.arrayvslist;

import java.util.ArrayList;
import java.util.Arrays;
public class Fixed_NotFixed
{
     public static void main(String args[]) {
    //Normal arrays in which we need to specify the size for array(here 5) 
    int[] Arr = new int[5];
    Arr[0] = 1;
    Arr[1] = 2;
    Arr[2] = 3;
    Arr[3] = 4;
    Arr[4] = 5;
    System.out.println("Accessing array contents:");
    System.out.println(Arrays.toString(Arr));
    /* We cannot add more elements to array Arr as it is fixed size, otherwise we will get an error(ArrayIndexOutOfBound).*/
    //ArrayList we need not to specify size in ArrayList
    ArrayList < Integer > ArrL = new ArrayList < Integer > ();
    ArrL.add(1);
    ArrL.add(2);
    ArrL.add(3);
    ArrL.add(4);
    // We can add more elements to ArrL, as many as we want.
    System.out.println("Accessing ArrayList contents:");
    System.out.println(ArrL);
  }
}