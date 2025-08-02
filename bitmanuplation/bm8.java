package bitmanuplation;

import java.util.ArrayList;
import java.util.Collections;

public class bm8 {
    public void set(int n,int k)
    {
        ArrayList<Integer>list1=new ArrayList<>();
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
          System.out.println(list1);
          Collections.reverse(list1);
          System.out.println(list1);

    }
    
}
class main091ndde
{
    public static void main(String[] args) {
        bm8 gtew=new bm8();
        int n=4;
        gtew.set(12,0);

    }
}