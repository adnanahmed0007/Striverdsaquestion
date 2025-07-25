package string;

import java.util.HashSet;

public class s12 {
    public void maibnsciujnt(String word)
    {
         int count=0;
        HashSet<Character>set1=new HashSet<>();
        for(int i=0;i<word.length()-1;i++)
        {
            char ch=word.charAt(i);
             set1.add(ch);
        }
        System.out.println(set1);

        for(Character ch1:set1)
        { 
             if(Character.isLowerCase(ch1))
             {
            char ch2=Character.toUpperCase(ch1);
            if(word.contains(String.valueOf(ch2)))
            {
                System.out.println(ch1+" "+ch2);
                count++;
            }
        }
        }
        
    }
    
}
class main08122
{
    public static void main(String[] args) {
        s12 gtrw=new s12();
        String words="Cc";
        gtrw.maibnsciujnt(words);
    }
}