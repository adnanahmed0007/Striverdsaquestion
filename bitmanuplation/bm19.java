package bitmanuplation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class bm19 {
    public void arra(int arr[])
    {
        HashMap<Integer,Integer>map1=new HashMap<>();
HashSet<Integer>set1=new HashSet<>();
        int arr1[]=new int[2];
        for(int value:arr)
        {
            set1.add(value);
            if(map1.containsKey(value))
            {
                int h=map1.get(value);
                int og=h+1;
                map1.put(value,og);
            }
            else{
                map1.put(value,1);
            }
        }
        int i=0;
         for(int value:set1)
         {
            if(map1.containsKey(value))
            {
                int h=map1.get(value);
                if(h==1)
                {
                    arr1[i]=value;
                    i++;
                    
                }
            }
             
         }
         
         Arrays.sort(arr1);


    }
}
class main1013
{
    public static void main(String[] args) {
        bm19 csrs=new bm19();
        int arr[]={1,2,3,4,1,2};
        csrs.arra(arr);
    }
}