package main.com.packes;

import java.util.Scanner;
import java.io. * ;
public class PackageDotClass {
  public static void main(String[] args) throws IOException {
    System.out.println("This class is in a subpackage");
    Scanner sc = new Scanner(System. in );
    System.out.println("We could use the Scanner class because we imported it");
  }
}