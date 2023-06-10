package main.com.wrapperclass;

import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.TypeInfo;
public class Autoboxing {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int a=3;
        //System.out.println(a.getClass()); This will result in an error because int is not an object.
        list.add(3);// Here the value 3 is primitive but converted to Wrapper class Integer
        list.add(4);
        System.out.println(list.get(0).getClass());
        System.out.println(list.toString());
    }
}