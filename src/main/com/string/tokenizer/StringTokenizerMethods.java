package main.com.string.tokenizer;

import java.util.*;
public class StringTokenizerMethods {
   public static void main(String args[])
     {
         String mydelim = " : ";
         String mystr = "JAVA : Code : String : Tokenizer : Dataflair";
         StringTokenizer flair3 =
                           new StringTokenizer(mystr, mydelim);
         int count = flair3.countTokens();
         for (int i = 0; i <count; i++)
             System.out.println("token at [" + i + "] : "
                                + flair3.nextToken());
         StringTokenizer string1 = null;
    while (flair3.hasMoreTokens())
             System.out.println(string1.nextToken());
     }
  }