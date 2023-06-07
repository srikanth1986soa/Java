package main.com.operators;

import java.io.*;
import java.util.*;

public class TernaryOperator {
    public static void main(String[] args) throws IOException {
        int num1 = 10, num2 = 5;
        String result = (num1 == 10) ? "num1 has value of 10": "num1 does not have value of 10";
        System.out.println(result); //the value of s is printed
        result = (num2 == 10) ? "num2 has value of 10": "num2 does not have value of 10";
        System.out.println(result); //the value of result is printed
    }
}