package main.com.encapsulation.test;

class DataFlair {
  private String course;
  DataFlair() {
    course = "Java";
  }
  /*public String getCourse()
    {
        return course;
    }*/
  public void setCourse(String course) {
    this.course = course;
  }
}
public class Encapsulation {
  public static void main(String[] args) {
    DataFlair df = new DataFlair();
    df.setCourse("java");
    System.out.println("You cannot see the value of the variable as there is no getter methods in the class definition");
    //System.out.println(df.getCourse());
    //System.out.println(DataFlair.course);
  }
}