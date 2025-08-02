package bitmanuplation;

import java.util.ArrayList;
import java.util.Collections;

public class bm12 {
    public void mnauba(int a,int b)
    {

 ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        while(a>=1)
        {
            if(a%2==0)
            {
                list1.add(0);
            }
            else
            {
                list1.add(1);
            }
            a=a/2;
        }
        while(b>=1)
        {
            if(b%2==0)
            {
                list2.add(0);
            }
            else
            {
                list2.add(1);
            }
            b=b/2;
        }
        System.out.println(list1+" "+list2);
        if(list1.size()>list2.size())
        {
            int h=list1.size()-list2.size();
            for(int i=0;i<h;i++)
            {
                list2.add(0);
            }
        }
        if(list1.size()<list2.size())
        {
            int h=list2.size()-list2.size();
            for(int i=0;i<h;i++)
            {
                list1.add(0);
            }
        }
        Collections.reverse(list1);
        Collections.reverse(list2);
        System.out.println(list1+" "+list2);
        int count=0;
        for(int i=0;i<list1.size();i++)
        {
            int h=list1.get(i);
            int m=list2.get(i);
            if(h!=m)
            {
                count++;
            }
        }
        System.out.println(count);
    }
    
}
class main01922s
{
    public static void main(String[] args) {
        bm12 gtre=new bm12();
        
        gtre.mnauba(10,20);
    }
}
