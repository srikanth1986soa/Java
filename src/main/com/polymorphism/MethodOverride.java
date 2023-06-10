package main.com.polymorphism;

class DataFlair {
  public void coursename() {
    System.out.println("We teach a variety of courses at DataFlair!");
  }
}
class Java extends DataFlair {
  public void coursename() {
    super.coursename();
    System.out.println("Java is one of the most important courses taught at DataFlair.");
  }
}
public class MethodOverride {
  public static void main(String[] args) {
    Java course = new Java();
    course.coursename();
  }
}