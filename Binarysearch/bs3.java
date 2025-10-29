package Binarysearch;

public class bs3
{
public void insertion(int nums[],int target)
{
int i=0;
int j=nums.length;
int m=0;

while(i<=j)
{
    int mid=(i+j)/2;
    m=mid;
    if(nums[mid]==target)
    {

        System.out.println("got "+" "+nums[mid]);
        break;
    }
    else if(nums[mid]<target){
        i=mid+1;

    }
    else 
    {
        j=mid-1;

    }
}
System.out.println(m);
}
}
class main9781
{
    public static void main(String[] args) {
        bs3 gtr=new bs3();
         int nums[] = {1,2,3,5,6}; 
         int target = 2;
         gtr.insertion(nums,target);
        
    }
}