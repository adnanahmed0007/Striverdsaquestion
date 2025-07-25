package string;

import java.util.Arrays;

public class s7 {
    public void samee(String s)
    {
       int count[]=new int[56];
       for(int i=0;i<s.length();i++)
       {
        char ch=s.charAt(i);
        count[ch-'A']++;
         
         
       }
       for(int i=0;i<count.length;i++)
       {
          char ch = (char) (i + 'A');
          System.out.println(ch+" "+count[i]);
       }
       Arrays.sort(count);
         
        
    }
    
}
class main0221
{
    public static void main(String[] args) {
        s7 gtr11=new s7();
      String  s = "tree";
      gtr11.samee(s);

    }
}