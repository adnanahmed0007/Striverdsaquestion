package bitmanuplation;

import java.util.ArrayList;
import java.util.Collections;
 

public class bm5 {
    public void change(long n)
    {
        ArrayList<Integer>list1=new ArrayList<>();
        while(n>=1)
        {
            if(n%2==0)
            {
                list1.add(0);
            }
            else{
                list1.add(1);
            }
            n=n/2;
        }
 
          ArrayList<Integer>list2=new ArrayList<>();
         for(int i=0;i<list1.size();i++)
         {
            if(i%2==0)
            {
               list2.add(0);
            }
            else{
                int h=list1.get(i);
                list2.add(h);
            }
 
         }
         System.out.println(list2);
         Collections.reverse(list2);
         long add=0;
           for(int i=0;i<list2.size();i++)
           {
              double k=2;
              double j=i;
              double pow=Math.pow(2, j);
              int pow1=(int) pow;
              add=add+pow1*list2.get(i);
              
           }
           System.out.println(add);
    }
    
}
class main0123ss
{
    public static void main(String[] args) {
        bm5 eww=new bm5();
        long n=30;
        eww.change(n);
    }
}
