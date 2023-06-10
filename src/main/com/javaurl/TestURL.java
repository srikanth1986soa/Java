package main.com.javaurl;

import java.net.*;
public class TestURL
{
    public static void main(String[] args)throws Exception{
        String url="https://data-flair.training/blogs/java-tutorial/";
        URL testurl= new URL(url);
        System.out.println("The string representation of the URL -> "+testurl.toString());
        System.out.println("The Authority of the URL -> "+testurl.getAuthority());
        System.out.println("The Path of the URL -> "+testurl.getPath());
        System.out.println("The Query of the URL -> "+testurl.getQuery());
        System.out.println("The host of the URL -> "+testurl.getHost());
        System.out.println("The file of the URL -> "+testurl.getFile());
        System.out.println("The port of the URL -> "+testurl.getPort());
        System.out.println("The default port of the URL -> "+testurl.getDefaultPort());
        System.out.println("The protocol of the URL -> "+testurl.getProtocol());
        
        
        System.out.println("The results are null or -1 in some cases because no particular values could not be parsed");
    }
}