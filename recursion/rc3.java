package recursion;

public class rc3 {
    public void slectio (int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int minindex=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[minindex]<arr[j])
                {

                    minindex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;

        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);

        }
    }
    
}
class main98s
{
    public static void main(String[] args) {
        rc3 gtr=new rc3();
        int arr[]={5,2,3,4,1,8,9,10};
        gtr.slectio(arr);
    }
}