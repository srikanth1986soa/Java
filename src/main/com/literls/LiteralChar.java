package main.com.literls;

public class LiteralChar {
    public static void main(String args[]) {
        char ch='A';
        char number= 0065;
        char uni='\u0065';
        System.out.print("\nThis is a character Literal:\b"+ch);
        System.out.print("\nThis is a character Literal as Integer:\b"+number);
        System.out.print("\nThis is a character Literal as Unicode:\b"+uni);
    }

}
