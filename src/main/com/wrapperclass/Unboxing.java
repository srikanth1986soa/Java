package main.com.wrapperclass;

public class Unboxing {
    public static void main(String[] args) {
        
        Integer wrapperInteger = new Integer(4);
        wrapperInteger.getClass();
        int a=wrapperInteger;//Unboxing
        System.out.println(a);
        //a.getClass(); This would result in an error because it is a primitive datatype. 
        
    }
    
}