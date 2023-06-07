package main.com.constructors;

public class CopyConstructor {
    String s;
    CopyConstructor(String string)
    {   
        this.s=string;
    }
    CopyConstructor(CopyConstructor object)
    {
        this.s=object.s;
    }
    public void valuesdisplay()
    {
        System.out.println("The object has the values-> "+s);
    }
    public static void main(String[] args) {
        CopyConstructor object=new CopyConstructor("DataFlair");
        CopyConstructor copyobject=new CopyConstructor(object);
        object.valuesdisplay();
        copyobject.valuesdisplay();
        
    }
    
}