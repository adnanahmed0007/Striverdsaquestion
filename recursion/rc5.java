package recursion;

public class rc5 {
    public void searching(int arr[],int k)
    {
        int i=0;
        int j=arr.length-1;
         while(i<j)
         {
            int mid=(i+j)/2;
           
            if(arr[mid]==k)
            {
                System.out.println(k+" "+"found"+" "+mid);
                break;
            }
            else if(arr[mid]>k)
            {
             
              j=mid-1;
            }
            else if(arr[mid]<k)
            {
                i=mid+1;
            }
         }


    }
    
}
class mainqq11{
    public static void main(String[] args) {
        rc5 fre=new rc5();
        int arr[]={1,2,3,4,5,6};
        fre.searching(arr, 3);

    }
}