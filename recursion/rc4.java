package recursion;

 

public class rc4 {
    public void buvbe(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int value:arr)
        {
            System.out.println(value);
        }
    }
    
}
class main0912{
    public static void main(String[] args) {
       rc4 gtr1=new rc4();
       int arr[]={1,2,9,8,7,4,10,89};
       gtr1.buvbe(arr);

    }
}