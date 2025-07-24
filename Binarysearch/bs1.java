package Binarysearch;

public class bs1 {
     public void finfnum(int arr[],int num)
     {
         int i=0;
         int j=arr.length;
         int g=-1;
        
         while(i<=j)
         {
              int mid=(i+j)/2;
              if(arr[mid]==num)
              {
                g=0;

                System.out.println("got the number"+" "+arr[mid]+" "+mid);
                break;
              }
              else if(arr[mid]>num)
              {
                j=mid-1;

              }
              else if(arr[mid]<num)
              {
                i=mid+1;
              }
        
         }
         if(g==-1)
         {
            System.out.println("we copuld noty find ");
         }

     }
}
class main12a
{
    public static void main(String[] args) {
        bs1 gt=new bs1();
        int arr[]={1,0,3,5,9,12};
        int h=-89;
        gt.finfnum(arr,h);
    }
}
