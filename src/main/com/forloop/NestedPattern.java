package main.com.forloop;

import java.io.*;
public class NestedPattern {
    public static void main(String[] args) {
        int arrp[] = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < arrp.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}
        
     