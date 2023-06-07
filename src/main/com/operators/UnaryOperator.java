package main.com.operators;

public class UnaryOperator {
    public static void main(String args[]) {
        int num1 = 10,
                num2 = 5,
                res;
        int num3 = 1;
        boolean flag = true;
        char character = 'a';
        res = +character; //The unary + converts  the character into a integer value
        System.out.println("The + operator on character transforms it to ASCII value " + res);
        num3 = -num3;
        System.out.println("The - operator on num1 positive  value " + num3);
        res = num1++; //First res=num1 then num1++ executed
        System.out.println("The res=num1++ returned value of " + res);
        res = ++num1; //First num1=num1+1 then res=num1
        System.out.println("The res=++num1 returned num1 value of " + res);
        res = num2--; //First res=num2 then num2=num2-1 executed
        System.out.println("The res=num2-- returned value of " + res);
        res = --num2; //First num2=num2-1 then res=num2 executed
        System.out.println("The res=--num2 returned num1 value of " + res);
        //Learning about NOT operator
        System.out.println("The NOT operator returns num1 value of " + !flag);
    }


}
