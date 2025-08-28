package Sorting;

public class SelectionsortPractice2 {
    public void selectio(int arr[])
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
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
             
        }

    }
    
}
class main90912aa
{
    public static void main(String[] args) {
        SelectionsortPractice2 str2=new SelectionsortPractice2();
        int arr[]={3,2,5,8,9,10,2,7};
        str2.selectio(arr);
        for(int value:arr)
        {
            System.out.println(value);
        }
    }
}