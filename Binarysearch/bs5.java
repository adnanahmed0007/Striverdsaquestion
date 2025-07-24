package Binarysearch;

public class bs5 {
    public void sotrtedarray(int nums[],int target)
    {
 int i=0;
 int j=nums.length-1;
 while(i<=j)
 {
    int mid=(i+j)/2;
    if(nums[mid]==target)
    {
        System.out.println(target+" "+mid);
    }
     else if(nums[i]<=nums[mid])
     {
        if(nums[mid]<)
     }
 }
    }
    
}
  interface  qss {
    public static void main(String[] args) {
        bs5 hyt=new bs5();
        int arr[]={4,5,6,7,0,1,2,3};
        int target=5;
        hyt.sotrtedarray(arr, target);
    }

    
}
