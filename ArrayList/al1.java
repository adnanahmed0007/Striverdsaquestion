package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class al1 {
    public boolean sosrt(ArrayList<Integer> list)
    {
        int first=list.get(0);
        int last =list.get(list.size()-1);
        if(first<last)
        {
        ArrayList<Integer>list2=new ArrayList<>(list); 
        Collections.sort(list);
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)!=list2.get(i))
            {
                return false;
            }
        }
        return true;
    }
    else{
        ArrayList<Integer>list2=new ArrayList<>(list); 
        Collections.sort(list);
        Collections.reverse(list);
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)!=list2.get(i))
            {
                return false;
            }
        }
        return true;

    }
 
        

    }
    
}
class main09assx
{
    public static void main(String[] args) {
        al1 gtr=new al1();
        int arr[]={3, 12, 0, 11};
        ArrayList<Integer>list1=new ArrayList<>();
        for(int value:arr)
        {
            list1.add(value);
        }
       boolean h= gtr.sosrt(list1);
       System.out.println(h);
         
    }
}