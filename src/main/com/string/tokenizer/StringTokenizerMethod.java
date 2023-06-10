package main.com.string.tokenizer;

import java.util.*;
public class StringTokenizerMethod
{
   public static void main(String args[])
   {
       String mydelim = " : ";
       String mystr = "JAVA : Code : String : Tokenizer : Flair";
       StringTokenizer stringName =
                     new StringTokenizer(mystr, mydelim);
       int count = stringName.countTokens();
       System.out.println("Number of tokens : " + count);
       while (stringName.hasMoreElements())
           System.out.println(stringName.nextElement());
   }
}