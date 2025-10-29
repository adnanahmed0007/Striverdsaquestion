package Stack;

import java.util.HashSet;
 

public class atr1 {
    public void sorted(int arr[])
    {
          HashSet<Integer>set1=new HashSet<>();
          for(int value:arr)
          {
            set1.add(value);
          }
          int i=0;
          for(int value:set1)
          {
            arr[i]=value;
            i++;
                    
          }
    }
    
}
class main09012
{
    public static void main(String[] args) {
        atr1 nq=new atr1();
        int nums[]={0,0,1,1,1,2,2,3,3,4};
        nq.sorted(nums);

    }
}
