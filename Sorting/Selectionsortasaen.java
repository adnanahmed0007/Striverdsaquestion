package Sorting;

public class Selectionsortasaen {
    public void select(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]>arr[minIndex])
                {
                    minIndex=j;
                }
            }
            int temnp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temnp;
        }
        for(int value:arr)
        {
            System.out.println(value);
        }
         

    }
    
}
class main011dde
{
    public static void main(String[] args) {
        Selectionsortasaen sde=new Selectionsortasaen();
        int arr[]={11,3,4,5,3,9,8,6};
        sde.select(arr);
    }
}