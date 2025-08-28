package Sorting;

public class Selectionsort {
    public void selectioibSOrt(int arr[])
    {
   for(int i=0;i<arr.length;i++)
   {
    int minIndex=i;
    for(int j=i+1;j<arr.length;j++)
    {
        if(arr[j]<arr[minIndex])
        {
            minIndex=j;
        }
    }
     int temp=arr[minIndex];
      arr[minIndex]=arr[i];
      arr[i]=temp;
      
      
   }
    
   
    }
    
}
class main101nwe
{
    public static void main(String[] args) {
        Selectionsort stw2=new Selectionsort();
        int arr[] = {5, 3, 8, 4, 2};
      stw2.selectioibSOrt(arr);
      for(int value:arr)
      {
        System.out.println(value+" k");
      }
       
       
       

    }
}