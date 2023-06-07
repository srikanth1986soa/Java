package main.com.statickeyword;

class MyEmployee
{ 
   int empId; 
   String empName; 
   static String companyName = "TCS"; 
   //static method to valueChange the value of static variable 
   static void valueChange()
   { 
      companyName = "DataFlair"; 
   } 
   //constructor to initialize the variable 
   MyEmployee(int id, String name){
      empId = id; 
      empName = name; 
   } 
//method to display values 
void display()
   {
      System.out.println(empId+" "+empName+" "+companyName);
   } 
} 
//class to create and display the values of object 
public class Demo {
   public static void main(String args[]) {
      MyEmployee.valueChange();//calling valueChange method
      //creating objects
      MyEmployee EmployeeObj = new MyEmployee(218, "Kushal");
      MyEmployee EmployeeObj1 = new MyEmployee(635, "Bhumika");
      MyEmployee EmployeeObj2 = new MyEmployee(147, "Renuka");
      //calling display method
      EmployeeObj.display();
      EmployeeObj1.display();
      EmployeeObj2.display();
   }
}