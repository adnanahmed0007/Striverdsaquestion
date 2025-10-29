package ArrayList;

import java.util.ArrayList;

public class al2 {
    public boolean sihs(ArrayList<Integer> list)
    {
          boolean acending=true;
          boolean decsnding=true;
          for(int i=1;i<list.size()-1;i++)
          {
              if(list.get(i)>list.get(i-1))
              {
                decsnding=false;
              }
              else
              {
                acending=false;
              }
              if(acending==false&&decsnding==false)
              { 
                return false;
              }
          }
          return acending|decsnding;
    }
    
}
class mainalhlis
{
    public static void main(String[] args) {
        al2 gtr=new al2();
        int arr[]={1,2,9,3,4,5};
        ArrayList<Integer>list1=new ArrayList<>();
        for(int value:arr)
        {
            list1.add(value);
        }
        System.out.println(list1);
       boolean h= gtr.sihs(list1);
       System.out.println(h);
        
    }
}