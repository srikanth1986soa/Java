package main.com.copyconstructor;

class Box
{
  double width, height, length;
  Box(double widthvar, double heightvar, double lengthvar)
  {
    width = widthvar;
    height = heightvar;
    length = lengthvar;
  }
  Box()
  {
    width = height = length = 0;
  }
  Box(double num) 
  { 
    width = height = length = num; 
  } 
  double volume()
  {
    return width * height * length;
  }
}
public class VolumeProgram
{
  public static void main(String args[])
  {
    Box mybox1 = new Box(10,20,30);
    Box mybox2 = new Box(); 
    Box mycube = new Box(5); 
    double volumeOfBox;
    volumeOfBox = mybox1.volume();
    System.out.println(" Value of First Constructor is " + volumeOfBox);
    volumeOfBox = mybox2.volume(); 
    System.out.println(" Value of Second Constructor is " + volumeOfBox); 
    volumeOfBox = mycube.volume(); 
    System.out.println(" Value of Third Constructor is " + volumeOfBox);   }
}