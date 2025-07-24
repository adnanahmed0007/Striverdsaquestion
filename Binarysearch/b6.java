package Binarysearch;

public class b6 {
    public void sortedinetime(int nums[])
    {
        int i=0;
        int j=i+1;
        while(j<=nums.length)
        {
            if(nums[i]==nums[j])
            {
                i=i+2;
                j=j+2;
            }
            else{
                 System.out.println(nums[i]);
                 break;
            }
        }
    }
    
}

class main811
{
    public static void main(String[] args) {
        b6 gtr=new b6();
      int  nums[] = {3,3,7,7,10,11,11};
      gtr.sortedinetime(nums);
    }
}