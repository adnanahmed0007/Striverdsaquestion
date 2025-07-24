package Binarysearch;

public class bs4 {
    public void fuisrtlast(int nums[],int target)
    {
     int i=0;
     int j=nums.length-1;
     int arr[]={-1,-1};
     while(i<=j)
     {
        int mid=(i+j)/2;
        if(nums[mid]==target)
        {
            arr[0]=mid;
             j=mid-1;
            
        }
        else if(nums[mid]<target)
        {
            i=mid+1;
        }
        else
        {
            j=mid-1;
        }
     }
     
      i=0;
      j=nums.length-1;
      while(i<=j)
      {
        int mid=(i+j)/2;
        if(nums[mid]==target)
        {
            arr[1]=mid;
            i=mid+1;
        }
        else if(nums[mid]>target)
        {
            j=mid-1;
        }
        else 
        {
            i=mid+1;
        }
      }
      System.out.println(arr[0]+" "+arr[1]);

      
     
    }
    
}
class main97911
{
    public static void main(String[] args) {
        bs4 fre=new bs4();
      int  nums[] = {5,7,7,8,8,10};
      int target=8;
      fre.fuisrtlast(nums,target);
     

    }
}