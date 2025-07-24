package Binarysearch;

public class bs2 {
    public void lowerBound(int arr[],int num)
    {

        int i=0;
        int j=arr.length-1;
        
        while(i<=j)
        {
            int mid=(i+j)/2;
            if(arr[mid]==num)
            {
                if(num>mid)
                {
                    System.out.println(num);
                     
                    break;
                    
                    
                    
                }
                
            }
            else if(arr[mid]<num)
            {
                i=mid+1;
            }
            else if(arr[mid]>num)
            {
                j=mid-1;
            }

        }
        System.out.println(" "+"j");
      

    }
    
}
class main17112
{
    public static void main(String[] args) {
        bs2 grww=new bs2();
        int arr[]={1,2,3,3,4};
        int num=3;
        grww.lowerBound(arr,num);
    }
}