package bitmanuplation;

 

public class bm14 {
    public void bma(int n)
    {
       int count=0;
        for(int i=1;i<=n;i++)
        {
            int num=i;
            while(num>=1)
            {
                if((num&1)==1)
                {
                    count++;
                }
                num>>=1;

                
            }
             
        }
         System.out.println(count);
        
    }
    
}
class mainbssw
{
    public static void main(String[] args) {
        bm14 fe=new bm14();
        int n=5;
        fe.bma(n);
    }
}
