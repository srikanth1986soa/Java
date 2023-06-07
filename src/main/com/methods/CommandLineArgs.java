package main.com.methods;

public class CommandLineArgs {
  public static void main(String[] args) {
    for (int i = 0; i < args.length; i++) {
      System.out.println("The argument number " + i + " is " + args[i]);
    }
  }
}