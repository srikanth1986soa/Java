package main.com.forloop;

public class LabelledForLoops {
    public static void main(String[] args) {
        
        int i,j;
        System.out.println("Let us see an example where we use nested loops without labels. ");
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
                System.out.println(i+" "+j);
                if(i==j)
                break;
            }
            System.out.print("\n");
        }
        System.out.println("Now let us see the difference when we use labels. ");
        aa:
        for(i=1;i<=5;i++)
        {
            bb:
            for(j=1;j<=5;j++)
            {
                System.out.println(i+" "+j);
                if(i==j)
                break aa;
            }
            System.out.print("\n");
        }
    }
    
}