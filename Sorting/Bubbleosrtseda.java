package Sorting;

public class Bubbleosrtseda {
    public void biblesorta(int arr[])
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
        for(int value:arr)
        {
            System.out.println(value);
        }

    }
    
}
class main09122w7
{
    public static void main(String[] args) {
        Bubbleosrtseda sr=new Bubbleosrtseda();
        int arr[]={1,8,4,6,7,2,3,4,5};
        sr.biblesorta(arr);
    }
}