package string;

public class s11 {
    public void palindrom(String s)
    {
        String s1=s.toLowerCase();
        String s2="";
        System.out.println(s1);
         for(int i=s1.length()-1;i>=0;i--)
         {
            
            char ch=s1.charAt(i);
             if(Character.isLetterOrDigit(ch))
             {
            s2=s2+ch;
             }
         }
         System.out.println(s2);
         int i=0;
         int j=s2.length()-1;
         while(i<=j)
         {
            if(s2.charAt(i)==s2.charAt(j))
            {

            }
         }

    }
    
}
class main091s
{
    public static void main(String[] args) {
        s11 htrw=new s11();
      String s = "0p";
      htrw.palindrom(s);
    }
}