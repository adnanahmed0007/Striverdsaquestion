package string;

public class s16 {
    public void Substrsing(String s)
    {
         int count[]=new int[26];
         for(int i=0;i<s.length();i++)
         {
            char ch=s.charAt(i);
            count[ch-'a']++;
         }
         for(int i=0;i<s.length();i++)
         {
            char ch=s.charAt(i);
            if(count[ch-'a']==1)
            {
                System.out.println(ch);
            }
         }
    }
    
}

class main01sqw
{
    public static void main(String[] args) {
        s16 fres=new s16();
       String s="leetcode";
       fres.Substrsing(s);
    }
}