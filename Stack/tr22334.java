package Stack;

import java.util.ArrayList;

public class tr22334 {
    public void sorted(int arr[])
    {
        int i=0;
        ArrayList<Integer>list1=new ArrayList<>();
        for(int j=1;j<arr.length;j++)
        {
            if(arr[i]!=arr[j])
            {
                i++;
                 
                arr[i]=arr[j];
               

            }
        }
    for(int k=0;k<=i;k++)
    {
         list1.add(arr[k]);
    }
    System.out.println(list1);
 
    }
    
}
class main891xsd
{
    public static void main(String[] args) {
        tr22334 btr=new tr22334();
        int nums[]={0,0,1,1,1,2,2,3,3,4};
        btr.sorted(nums);
    }
}