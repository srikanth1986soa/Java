package main.com.autoboxunbox;

import java.util.*;
public class AutoBox
{
public static void main(String[] args) {
        //We are going to declare a Stack which can only store Integer values in it. 
        Stack<Integer>stack = new Stack<>();
        int a=6;
        int b=12;
        stack.push(a);
        stack.push(b);
        System.out.println(stack.pop());
        
    }
}