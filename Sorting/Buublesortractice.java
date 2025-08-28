package Sorting;

public class Buublesortractice {
    public void Bubllesorta(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<arr.length-i;j++)
            {
                if(arr[j-1]<arr[j])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
    
}
class main12a1211{
    public static void main(String[] args) {
        Buublesortractice st1=new Buublesortractice();
      int arr[] = {5, 3, 8, 4, 2,10,7,5,6,3};
      st1.Bubllesorta(arr);
      for(int value:arr)
      {
        System.out.println(value);
      }

    }
}