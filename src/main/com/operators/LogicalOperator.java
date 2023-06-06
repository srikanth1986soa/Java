package main.com.operators;

import java.io. * ;
import java.util. * ;
public class LogicalOperator {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System. in );
        String uname;
        String course;
        System.out.println("Enter the  username");
        System.out.println("Enter the course");
        uname = sc.next();
        course = sc.next();
        if (uname.equals("DataFlair") && course.equals("Java")) {
            System.out.println("Your course is going on at DataFlair");
        }
        System.out.println("Enter the  username");
        System.out.println("Enter the course");
        uname = sc.next();
        course = sc.next();
        if (uname.equals("DataFlair") || course.equals("Python")) {
            System.out.println("You are either studying at Dataflair or studying python");
        }
    }
}
