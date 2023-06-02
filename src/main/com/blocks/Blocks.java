package main.com.blocks;

class Blocks {
    static
    {
        // Print statement
        System.out.println(
                "Static block can be printed without main method");
    }
    {
        System.out.println("This is my object block");
    }
    public static void main(String args[]) {
        System.out.println("I am blocks");
        System.out.println(InnerClassBlocks.i);
    }


}

class InnerClassBlocks {

    // Case 1: Static variable
    static int i;
    // Case 2: non-static variables
    int j;

    // Case 3: Static block
    // Start of static block
    static
    {
        i = 10;
        System.out.println("static block called ");
    }
    // End of static block
}
