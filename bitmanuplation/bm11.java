package bitmanuplation;
import java.util.ArrayList;
import java.util.Collections;
public class bm11 {
    public void rotataing(int n,int d)
    {
         ArrayList<Integer>list1=new ArrayList<>();
         ArrayList<Integer>list4=new ArrayList<>();
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
         int h=16-list1.size();
         for(int i=1;i<=h;i++)
         {
            list1.add(0);
         }
         Collections.reverse(list1);
          
      
         ArrayList<Integer>list2=new ArrayList<>();
         for(int i=d;i<list1.size();i++)
         {
            int g=list1.get(i);
            list2.add(g);
         }
         for(int i=0;i<d;i++)
         {
            int g=list1.get(i);
            list2.add(g);
         }
          
          Collections.reverse(list2);
           int add=0;
          for(int i=0;i<list2.size();i++)
          {
            add=add+list2.get(i)*(1<<i);
          }
           
          ArrayList<Integer>list3=new ArrayList<>();
          
          for(int i=list1.size()-d;i<list1.size();i++)
          {
               list3.add(list1.get(list1.size()-d));

          }
            for(int i=0;i<list1.size()-d;i++)
            {
                list3.add(list1.get(i));

            }
            System.out.println(list3);
             Collections.reverse(list3);
           int add1=0;
          for(int i=0;i<list3.size();i++)
          {
            add1=add1+list3.get(i)*(1<<i);
          }
          list4.add(add);
          list4.add(add1);
          System.out.println(list4);
           
           
    }
    
}
class main09811s
{
    public static void main(String[] args) {
        bm11 hyte=new bm11();
       int n = 28;
       hyte.rotataing(29, 2);
    }
}