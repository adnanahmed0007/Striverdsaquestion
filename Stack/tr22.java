package Stack;

public class tr22 {
    public void sas(int arr[])
    {
         int i=0;
         for(int j=1;j<arr.length;j++)
         {
            if(arr[j]!=arr[i])
            {
                i++;
                arr[i]=arr[j];
            }
         }
           int k=i;
           for(int h=0;h<=k;h++)
           {
            System.out.println(arr[h]);
           }
    }
    
}
class main891xsds
{
    public static void main(String[] args) {
        tr22 btr=new tr22();
        int nums[]={0,0,1,1,1,2,2,3,3,4};
        btr.sas(nums);
    }
}