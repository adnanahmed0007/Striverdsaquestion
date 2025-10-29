 package ArrayList;

import java.util.ArrayList;

public class al3 {
    public boolean sihs1(ArrayList<Integer> list)
    {
          boolean acending=false;
          boolean decsnding=false;
          for(int i=1;i<list.size()-1;i++)
          {
              if(list.get(i)>list.get(i-1))
              {
                acending=true;
                
              }
              else
              {
                 decsnding=true;
              }
               
          }
          if(acending&&decsnding)
          {
            return false;
          }
          return acending|decsnding;
    }
    
}
class mainalhlis1
{
    public static void main(String[] args) {
        al3 gtr1=new al3();
        int arr[]={3,2,2,1,0};
        ArrayList<Integer>list1=new ArrayList<>();
        for(int value:arr)
        {
            list1.add(value);
        }
        System.out.println(list1);
       boolean h= gtr1.sihs1(list1);
       System.out.println(h);
        
    }
}
