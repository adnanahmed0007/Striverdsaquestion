package Sorting;

public class Bubllesort {
    public void sortingkaav(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
         
    }
    
}
class main12a12{
    public static void main(String[] args) {
        Bubllesort st1=new Bubllesort();
      int arr[] = {5, 3, 8, 4, 2};
      st1.sortingkaav(arr);
      for(int value:arr)
      {
        System.out.println(value);
      }

    }
}
