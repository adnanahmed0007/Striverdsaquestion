package bitmanuplation;

import java.util.HashSet;

public class bm15 {
    public void bita(int n)
    {
    HashSet<Integer>set1=new  HashSet<>();
        while(n>=1)
        {
            if((n&1)==1)
            {
                set1.add(1);

            }
            else if( (n & 1) == 0)
            {
set1.add(0);
            }
            n>>=1;
        }
         
         
        System.out.println(set1);

    }
    
}
class maim1022
{
    public static void main(String[] args) {
        bm15 fee1=new bm15();
        fee1.bita(42);
        
    }

}