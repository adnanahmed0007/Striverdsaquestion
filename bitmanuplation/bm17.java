package bitmanuplation;



public class bm17 {
     public boolean miaa(int n)
    {
        int a=n>>=1;
        while(a>=1)
        {
            if((n&1)==1&&(a&1)==1)
            {
                   return false;
            }
            n>>=1;
            a>>=1;
            
        }
        return true;
        
    }
    
}
class main08112111
{
    public static void main(String[] args) {
        bm17 gtww=new bm17();
        int n=14;
        gtww.miaa(n);
    }
}
