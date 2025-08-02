package bitmanuplation;

import java.util.ArrayList;
import java.util.Collections;

public class bm9 {
    public static void posOfRightMostDiffBit(int m, int n) {
        
        ArrayList<Integer>list1=new ArrayList<>();
                ArrayList<Integer>list2=new ArrayList<>();

          while(n>=1)
          {
            if(n%2==0)
            {
                list1.add(0);
            }
            else 
            {
                list1.add(1);
            }
            n=n/2;
          }
          while(m>=1)
          {
            if(m%2==0)
            {
                list2.add(0);
            }
            else 
            {
                list2.add(1);
            }
            m=m/2;
          }
         
          
          
            System.out.println(list1+" "+list2);
          int i=0;
          while(i<list1.size()&&i<list2.size())
          {
              int firs=list1.get(i);
              int seck=list2.get(i);
              if(firs!=seck)
              {
                   
              }
              i++;
          }
        
          
    }
    
}
class main0911sd
{
    public static void main(String[] args) {
        bm9 hyre=new bm9();
        int m=11;
        int n=9;
        hyre.posOfRightMostDiffBit(15, 3);
    }
}