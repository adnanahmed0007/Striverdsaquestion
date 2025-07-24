package Binarysearch;

public class bs6 {
    public void peaLKelement(int nums[])
    {
        int j=nums.length-2;
      int k=nums.length-1;
      while(j>=0)
      {
        if(nums[j]>nums[k])
        {
            
            j--;
            k--;
        }
        else{
             System.out.println(nums[k]);
        }
      }

    }
    
}
class main76112
{
    public static void main(String[] args) {
        bs6 gw=new bs6();
        int arr[]={1,2,1,3,7,6,4};
        gw.peaLKelement(arr);
    }
}
