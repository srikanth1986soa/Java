package main.com.blocks;

class NormalBlock {

    static {
        System.out.println("hello from Static");
    }
    //object block

    {
        System.out.println("This is my object block");
    }

    public static void main(String args[]) {
        System.out.println("hello from main");
        NormalBlock obj = new NormalBlock();
    }
}