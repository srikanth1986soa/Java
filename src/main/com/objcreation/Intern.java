package main.com.objcreation;

import java.io.Serializable;
public class Intern implements Serializable
{
    int Internid;    
    String InternName;    
    public Intern(int Internid, String InternName)   
    {    
       this.Internid = Internid;    
       this.InternName = InternName;    
    }    
}