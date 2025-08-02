package bitmanuplation;

public class bm10 {
    public void maina1String(String s)
    {
         StringBuilder sb=new StringBuilder(s);
         sb.reverse();
         int add=0;
         for(int i=0;i<sb.length();i++)
         {
            char ch=sb.charAt(i);
            int k=Integer.parseInt(String.valueOf(ch));
            add=add+k*(1<<i);

         }
         System.out.println(add);

    }
    
}
class main09111{
    public static void main(String[] args) {
        bm10 gtr1w=new bm10();
        String s="100";
        System.out.println();
        gtr1w.maina1String(s);
    }
}