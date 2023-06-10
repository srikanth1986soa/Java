package main.com.bubblesort;

class bubble_sort
{
    public static void main()
    {
        int i,j,temp,n=8;
        int array[]={1,2,3,4,5,6,7,8};
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(array[j]<array[j+1])
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println("The array after sorting is: \n");
        for(i=0;i<n;i++)
        {
            System.out.print(array[i]);
        }
    }
}