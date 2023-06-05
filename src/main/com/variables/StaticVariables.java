package main.com.variables;


import java.io.*;
public class StaticVariables {
    static int studentCount;
    StaticVariables() {
        studentCount = 15;
    }
    void addStudent() {
        studentCount++;
    }
    public static void main(String[] args) throws IOException {
        StaticVariables java = new StaticVariables();
        StaticVariables python = new StaticVariables();
        java.addStudent();
        python.addStudent();
        System.out.println("Total Students " + studentCount);
    }
}
