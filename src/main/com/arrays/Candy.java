package main.com.arrays;

public class Candy {
  //class to define candy. 
  public String candy_name;
  public String flavour;
  Candy(String cname, String flav) {
    candy_name = cname;
    flavour = flav;
  }
  public static void main(String[] args) {
    int i;
    Candy arr_obj[] = new Candy[5];
    //created five objects of candy
    arr_obj[0] = new Candy("Alpenliebe", "Vanilla");
    arr_obj[1] = new Candy("Alpenliebe", "Butterscotch");
    arr_obj[2] = new Candy("Eclairs", "Chocolate");
    arr_obj[3] = new Candy("Mars", "Chocolate");
    arr_obj[4] = new Candy("Snickers", "Chocolate");
    //declared objects in the array candy 
    for (i = 0; i < 5; i++) {
      System.out.println(arr_obj[i].candy_name + " has a flavor of " + arr_obj[i].flavour);
    }
  }
}