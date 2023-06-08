package main.com.typeconversion;

public class TypePromotionExpression {
    public static void main(String[] args) {
        
        System.out.println("This program will illustrate the automatic type promotion of Java");
        char c='s';
        int a=1;
        int b=c+a;
        System.out.println("This means that b is now an int value "+b);
        System.out.println("We can explicitly typecast it to a character like this "+(char)(b));
        
        
    }
}