package main.com.switchcase;

import java.util.*;
public class WrapperSwitch
{
    public static void main(String[] args) {
        Integer choice;
        System.out.println("1. Java\n 2. Python\n 3.C++\n");
        Scanner sc = new Scanner(System.in);
        choice=sc.nextInt();
        
        switch(choice)
        {
            case 1:
                System.out.println("Java requires a good knowledge of Object Oriented Programming");
                break;
            case 2:
                System.out.println("Easiest language to learn. Known as executable pseudocode");
                break;
            case 3:
                System.out.println("Best language for competitive programming");
                break;
            default:
                System.out.println("Wrong choice");
            
        }
    }
}