package bitmanuplation;

public class bm1 {
    public void bitmanu(String s)
    {
         StringBuilder sb=new StringBuilder(s);
        sb.reverse();
         
        int add=0;
        for(int i=0;i<sb.length();i++)
        {
            char ch=sb.charAt(i);
          int didg=Integer.parseInt(String.valueOf(ch));
         add=add+(1<<i)*didg;
        }
        System.out.println(add);
         
        
    }
    
}
class main091223
{
    public static void main(String[] args) {
        bm1 gtrw=new bm1();
        
        gtrw.bitmanu("1000");
        
    }
}