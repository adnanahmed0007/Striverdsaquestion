package bitmanuplation;

import java.util.ArrayList;

public class bm16 {
    public void miaa(int n)
    {
        int count=0;
        int min=Integer.MIN_VALUE;
        ArrayList<Integer>list1=new ArrayList<>();
       while(n>=1)
       {
        if((n&1)==1)
        {
            list1.add(1);
            count++;
        }
        else{
            list1.add(0);
            System.out.println(count);
            if(count>min)
            {
                min=count;
            }
            count=0;
        }
      n>>=1;

       }
       if(count>min)
       {
        min=count;
       }
       
       System.out.println("dd"+list1+" "+min);
    }
    
}
class main081121
{
    public static void main(String[] args) {
        bm16 gtww=new bm16();
        int n=14;
        gtww.miaa(n);
    }
}
