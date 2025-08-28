package Sorting;

public class insertionsortractive {
    public void codeee(int arr[])
    {
for(int i=1;i<arr.length;i++)
{
    int temp=arr[i];
    int j=i-1;
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
class main9112
{
    public static void main(String[] args) {
        insertionsortractive srw =new insertionsortractive();
        int arr[]={6,4,5,2,8,9,23};
        srw.codeee(arr);
    }
}