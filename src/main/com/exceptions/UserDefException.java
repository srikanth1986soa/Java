package main.com.exceptions;

public class UserDefException extends Exception
{
  private static int year;
  public UserDefException(int year)
  {
    this.year=year;
  }
  public String toString()
  {
    return "Age below 18, Underaged!!!";
  }
  public static void main(String args[]) throws Exception
  {
    UserDefException obj = new UserDefException( 2005 );
    if(year > 2003)
    {
      throw new UserDefException(year);
    }
    else
    {
      System.out.println("Entered year is: " +year);
    }
  }
}