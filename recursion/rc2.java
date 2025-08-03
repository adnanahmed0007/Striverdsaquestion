package recursion;

import java.util.ArrayList;
import java.util.Collections;

public class rc2 {
    ArrayList<Integer>list1=new ArrayList<>();
     
              ArrayList<Integer>list3=new ArrayList<>();
    public void recer(int n)
    {
        if(n==0)
        {
            list1.add(0);
              ArrayList<Integer>list2=new ArrayList<>(list1);
             Collections.reverse(list2);
              
             for(int i=0;i<list1.size();i++)
             {
                list3.add(list1.get(i));
             }
             for(int i=1;i<list2.size();i++)
             {
                list3.add(list2.get(i));
             }
             System.out.println(list3);
             
             
             
            
            return;
        }
        list1.add(n);
        recer(n-5);
         
        

    }
    
}
class main092111{
    public static void main(String[] args) {
        rc2 rew=new rc2();
        int n=15;
        rew.recer(n);
    }
}