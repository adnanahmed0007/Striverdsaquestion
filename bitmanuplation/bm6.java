package bitmanuplation;

import java.util.ArrayList;
import java.util.Collections;

public class bm6 {
    public void flick(int start ,int goal)
    {

        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        while(start>=1)
        {
            if(start%2==0)
            {
                list1.add(0);
            }
            else{
                list1.add(1);
            }
            start=start/2;
        }
        while(goal>=1)
        {
            if(goal%2==0)
            {
                list2.add(0);
            }
            else{
                list2.add(1);
            }
            goal=goal/2;
        }
        if(list1.size()<list2.size())
        {
            int h=list2.size()-list1.size();
            for(int i=0;i<h;i++)
            {
                 list1.add(0);
            }
             
        }
        else if(list1.size()>list2.size())
        {
            int h=list1.size()-list2.size();
            for(int i=0;i<h;i++)
            {
                 list2.add(0);
            }

        }
          
        Collections.reverse(list1);
        Collections.reverse(list2);
       
        int i=0;
        int count=0;
        while(i<list1.size())
        {
            int h=list1.get(i);
            int h1=list2.get(i);
            if(h!=h1)
            {
                count++;
            }
            i++;

        }
        
         
         
    }
    
}
class main081sw
{
    public static void main(String[] args) {
        bm6 gtr=new bm6();
        int start=10;
        int goal=7;
        gtr.flick(start,goal);
    }
}