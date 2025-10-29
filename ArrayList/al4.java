package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class al4 {
    public void chceke(int a[],int b[])
    {
        ArrayList<Integer>list=new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
         int i=0;
         int j=0;
         while(i<a.length&&j<b.length)
         {
            if(a[i]<b[j])
            {
                if(!list.contains(a[i]))
                {
                list.add(a[i]);
                }
                i++;
            }
            else if(b[j]<a[i])
            {
                if(!list.contains(b[j]))
                {
                    list.add(b[j]);
                }
                 
                j++;
            }
            else
            {

                 if(!list.contains(b[j]))
                {
                    list.add(b[j]);
                }
                i++;
                j++;
            }
         }

          while(i<a.length)
          {
            if(!list.contains(a[i]))
            {
                list.add(a[i]);

            }
            i++;
          }
           while(j<b.length)
          {
            if(!list.contains(b[j]))
            {
                list.add(b[j]);

            }
            j++;
          }
         
         System.out.println(list);

    }
    
}
class main01saq
{
    public static void main(String[] args) {
        al4 gtree=new al4();
       int a[] = {1, 2, 3, 2, 1};
       int b[] = {3, 2, 2, 3, 3, 2};
       gtree.chceke(a, b);
    }
}
