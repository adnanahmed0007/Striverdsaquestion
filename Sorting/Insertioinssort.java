package Sorting;

public class Insertioinssort {
    public void insewrtyion(int arr[])
    {
 for(int i=1;i<arr.length;i++)
 {
    int j=i-1;
    int temp=arr[i];
    while(j>=0&&arr[j]>temp)
    {
        arr[j+1]=arr[j];
        j--;
    }
    arr[j+1]=temp;
 }
 for(int value:arr)
 {
    System.out.println(value);
 }
    }
    
}
class main0911w
{
    public static void main(String[] args) {
        Insertioinssort str=new Insertioinssort();
        int arr[]={1,4,2,8,9,3,6};
        str.insewrtyion(arr);
    }
}