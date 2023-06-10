package main.com.encapsulation;

class DataFlair {
  private String course;
  public String getCourse() {
    return course;
  }
  public void setCourse(String s) {
    this.course = s;
  }
}
public class Encapsulation {
  public static void main(String[] args) {
    DataFlair df = new DataFlair();
    df.setCourse("Java");
    System.out.println(df.getCourse());
    //System.out.println(DataFlair.course);
  }
}