package main.com.variables;

import java.io.*;
public class Instance {

    int height,
            weight; // Instance Variables

    Instance(int h, int w) {
        this.height = h;
        this.weight = w;
    }

    void run() {
        System.out.println("Huff Puff");
    }

    void print() {
        System.out.println("Now my weight is" + this.weight);
    }

    public static void main(String[] args) throws IOException {
        Instance A = new Instance(170, 65);
        A.run();
        A.print();
    }
}
