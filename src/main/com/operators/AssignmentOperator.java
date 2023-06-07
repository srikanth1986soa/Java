package main.com.operators;

import java.io. * ;
import java.util. * ;
public class AssignmentOperator {
    public static void main(String[] args) throws IOException {
        int num1 = 10,
                num2 = 5,
                result;
        num1 += 5; //action of num1=num1+ 5
        System.out.println("The output of num1+=5 is " + num1);
        num1 -= 5; //action of num1=num1+ 5
        System.out.println("The output of num1-=5 is " + num1);
        num1 *= 5; //action of num1=num1+ 5
        System.out.println("The output of num1*=5 is " + num1);
        num1 /= 5; //action of num1=num1+ 5
        System.out.println("The output of num1/=5 is " + num1);
        num1 %= 5; //action of num1=num1+ 5
        System.out.println("The output of num1%=5 is " + num1);
    }
}
