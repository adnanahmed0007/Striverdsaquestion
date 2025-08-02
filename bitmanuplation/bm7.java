package bitmanuplation;

public class bm7 {
    public void count(int n)
    {
        int prime=0;
         
             for(int i=1;i<n;i++)
             {
                int count=0;
                for(int j=1;j<i;j++)
                {
                    if(i%j==0)
                    {
                        if(count>1)
                        {
                            break;
                        }
                        count++;
                    } 
                }
                if(count==1)
                {
                     prime++;
                }
            }
            System.out.println(prime);
             
    }
    
}
class main0911
{
    public static void main(String[] args) {
        bm7 rw=new bm7();
        int n=10;
        rw.count(n);
    }
}
