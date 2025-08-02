package bitmanuplation.Bitwise;

public class bt1 {
    public void biwshift(int n,int k)
    {
         int xor=n^k;
         int post=0;
         while((xor&1)==0)
         {
            xor=xor>>1;
            post++;


         }
          
System.out.println(post);


    }
    
}
class maima11s{
    public static void main(String[] args) {
        bt1 gte=new bt1();
        int n=13;
        gte.biwshift(9,11);
    }
}