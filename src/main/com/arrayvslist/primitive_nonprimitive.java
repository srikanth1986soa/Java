package main.com.arrayvslist;

import java.util.ArrayList;
public class primitive_nonprimitive
{
    public static void main(String args[]) {
    // primitive types allowed in an array
    int[] array = new int[3];
    // Objects are also allowed in an array
    primitive_nonprimitive[] array1 = new primitive_nonprimitive[3];
    // Not allowed to add primitive type-below line gives compiler error
    ArrayList < char > arrayList = new ArrayList < char > ();
    // This is Allowed in ArrayList as Wrapper Class is Used
    ArrayList < Integer > arrayList1 = new ArrayList < >();
    ArrayList < String > arrayList2 = new ArrayList < >();
    ArrayList < Object > arrayList3 = new ArrayList < >();
  }
}