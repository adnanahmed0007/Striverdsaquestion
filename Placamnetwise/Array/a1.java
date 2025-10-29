package Placamnetwise.Array;

public class a1 {
    public void swapa(int arr[])
    {
        int k=1;
         for(int m=0;m<k;m++)
         {
        for(int i=arr.length-1;i>0;i--)
        {
            int temp=arr[i-1];
            arr[i-1]=arr[i];
            arr[i]=temp;

        }
    }
        for(int value:arr)
        {
            System.out.println(value);
        }

    }
}
class maia0anss
{
    public static void main(String[] args) {
        a1 gtr=new a1();
        int arr[]={1,2,3,4,5,6,7,8,9};
        gtr.swapa(arr);
    }
}