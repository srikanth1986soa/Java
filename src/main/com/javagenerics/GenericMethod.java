package main.com.javagenerics;

public class GenericMethod {
    public <T> void methodgen(T var1)
    {
        System.out.println("The value passed is of type "+var1.getClass().getSimpleName());
    }
    public static void main(String[] args) {
        
        GenericMethod ob = new GenericMethod();
        ob.<String>methodgen("DataFlair is the best");
        //Sometimes we can omit the explicit mention of the type in <> and the compiler can automatically identify the type. 
        ob.methodgen("Learning Java at DataFlair");
        ob.methodgen(154);
    }
}