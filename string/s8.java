package string;

import java.util.Arrays;

public class s8 {
    public void Syring(String s)
    {
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        String sortedstring=new String(ch);
        System.out.println(sortedstring);

    }
    
}
class main01sqq
{
    public static void main(String[] args) {
        s8 hyt=new s8();
       String s1 = "tree";
       hyt.Syring(s1);

    }
}
