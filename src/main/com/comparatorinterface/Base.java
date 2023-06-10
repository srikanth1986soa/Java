package main.com.comparatorinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Cars
{
    //this is the class that defines the properties of a car object.
    //The car would have a name. A type. and an ID. 
    String name;
    String type;
    long ID;
    Cars(String name, String type, long ID)
    {
        this.name=name;
        this.type=type;
        this.ID=ID;
    }
}
class NameComparator implements Comparator
{
    @Override
    public int compare(Object o1, Object o2) {
        // TODO Auto-generated method stub
        Cars c2=(Cars)o2;
        Cars c1=(Cars)o1;
        return c1.name.compareTo(c2.name);
    }
}
class TypeComparator implements Comparator
{
    @Override
    public int compare(Object o1, Object o2)
    {
        Cars c2=(Cars)o2;
        Cars c1=(Cars)o1;
        return c1.type.compareTo(c2.type);
    }
}
public class Base {
    public static void main(String[] args) {
        List<Cars> carslist = new ArrayList<>();
        carslist.add(new Cars("Viper","Sports",1125412342l));
        carslist.add(new Cars("Supra","Sports",1244560087l));
        carslist.add(new Cars("Royce","Sedan",1111412341l));
        carslist.add(new Cars("Patriot","OffRoad",9831441244l));
        System.out.println("The cars before sorting\n\n");
        carslist.forEach((car)->System.out.println(car.name+" "+car.type+" "+car.ID));
        //Now we sort by the name
        Collections.sort(carslist, new NameComparator());
        System.out.println("\n\nThe cars after sorting by the car names\n\n");
        carslist.forEach((car)->System.out.println(car.name+" "+car.type+" "+car.ID));
        System.out.println("\n\nThe cars after sorting them by their type\n\n");
        //Now we sort the values by their type. 
        Collections.sort(carslist,new TypeComparator());
        carslist.forEach((car)->System.out.println(car.name+" "+car.type+" "+car.ID));
        
    }
    
}