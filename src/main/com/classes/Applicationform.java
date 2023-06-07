package main.com.classes;

public class Applicationform
{
    String Name;
    int Age;
    String Gender;
    Applicationform(String name, int age, String gender) {
        this.Name = name;
        this.Age = age;
        this.Gender = gender;
    }
    public static void main(String args[]) {
        Applicationform obj1 = new Applicationform("Arka Ghosh", 21, "Male");
        Applicationform obj2 = new Applicationform("Aradhya Sarkar", 22, "Female");
        System.out.println("Name: " + obj1.Name);
        System.out.println("Age: " + obj1.Age);
        System.out.println("Gender: "+obj1.Gender);
        System.out.println("Name: " + obj2.Name);
        System.out.println("Age: " + obj2.Age);
        System.out.println("Gender: "+obj2.Gender);
    }
}