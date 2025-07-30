package bitmanuplation;

public class bm1 {
    public void bitmanu(int n)
    {
        StringBuilder sb=new StringBuilder();
        while(n>=1)
        {
            if(n%2==0)
            {
                sb.append(0);
            }
            else{
                 sb.append(1);
            }
            n=n/2;

        }
        sb.reverse();
        System.out.println(sb);
        
    }
    
}
class main091223
{
    public static void main(String[] args) {
        bm1 gtrw=new bm1();
        int n=13;
        gtrw.bitmanu(n);
        
    }
}