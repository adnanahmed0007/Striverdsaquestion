package string;

import java.util.Arrays;

public class s14 {
    public boolean anangram(String s,String t)
    {
        char ch1[]=s.toCharArray();
        char ch2[]=t.toCharArray();
         Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(ch1);
        System.out.println(ch2);
        
        for(int i=0;i<ch1.length;i++)
        {
                if(ch1[i]!=ch2[i])
                {
                    return false;
                }
            
        }
        return true;

    }
    
}
class main99122sw
{
    public static void main(String[] args) {
        s14 fre=new s14();
        String s = "anagp";
        String t = "nagau";
       boolean k= fre.anangram(s, t);
       System.out.println(k);
    }
}
