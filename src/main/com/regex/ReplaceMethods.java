package main.com.regex;

import java.util.regex. * ;
public class ReplaceMethods {
  public static void main(String args[]) {
    String orgstr = new String("the quick brown fox jumped over the lazy dog");
    System.out.println("Original String is ': " + orgstr);
    System.out.println("String after replacing 'fox' with 'dog': " + orgstr.replace("fox", "dog"));
    System.out.println("String after replacing all 't' with 'a': " + orgstr.replace('t', 'a'));
    String sent = "DataFlair is a great place to go for learning";
    //remove white spaces from the sentence
    String str2 = sent.replaceAll("\\s", "");
    System.out.println(str2);
    sent = "This website also provides free tutorials on Java,Python and even Machine Learning! ";
    //Only Replace first 's' with 'r' in the entire sentence.  
    String str1 = sent.replaceFirst("s", "r");
    System.out.println(str1);
  }
}