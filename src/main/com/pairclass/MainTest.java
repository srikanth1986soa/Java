package main.com.pairclass;

import javafx.util.Pair;
import java.util.*;
public class MainTest
{
    
    public static void main(String[] args) {
        Pair<String,String>p1=new Pair<>("WINDOWS","it's GUI");
        Pair<String,String>p2=new Pair<>("LINUX","it is open source and secure");
        Pair<String,String>p3=new Pair<>("MAC OS","its productivity");
        ArrayList<Pair<String,String>> listofpairs = new ArrayList<>();
        listofpairs.add(p1);
        listofpairs.add(p2);
        listofpairs.add(p3);
        for(Pair<String,String> p:listofpairs)
        {
            System.out.println(p.getKey()+" is famous for "+p.getValue());
        }
        
    }
}