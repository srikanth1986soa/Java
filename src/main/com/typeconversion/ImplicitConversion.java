package main.com.typeconversion;

public class ImplicitConversion
{
    public static void main(String[] args) {
        
        int numberint;
        short numbershort;
        byte numberbyte;
        float numberfloat;
        double numberdouble;
        long numberlong;
        //We have the datatypes we need. Now let us set a value to the shortest datatype. 
        //That is byte. 
        numberbyte=21;
        numbershort=numberbyte;
        numberint=numbershort;
        numberlong=numberint;
        numberfloat=numberlong;
        numberdouble=numberfloat;
        System.out.println("The short value is "+numbershort);
        System.out.println("The byte value is "+numberbyte);
        System.out.println("The int value is "+numberint);
        System.out.println("The long value is "+numberlong);
        System.out.println("The float value is "+numberfloat);
        System.out.println("The long value is "+numberdouble);
        
        System.out.println("This is explicit conversion");
    }
}