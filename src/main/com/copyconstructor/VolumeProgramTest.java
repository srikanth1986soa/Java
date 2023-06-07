package main.com.copyconstructor;

class BoxTest
{
  double width, height, length;
  int boxNo;
  BoxTest(double widthvar, double heightvar, double lengthvar, int num)
  {
    width = widthvar;
    height = heightvar;
    length = lengthvar;
    boxNo = num;
    
  }
  BoxTest()
  {
    width = height = length = 0;
  }
  BoxTest(int num)
  {
  this();
  boxNo = num;
  }
  double volume()
  {
    return width * height * length;
  }
}
public class VolumeProgramTest
{
  public static void main(String args[])
  {
    BoxTest mybox1 = new BoxTest(10);
    double volumeOfBox;
    volumeOfBox = mybox1.volume();
    System.out.println(" Volume of mybox1 is " + volumeOfBox);
  }
}