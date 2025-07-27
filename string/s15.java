package string;

import java.util.HashSet;

public class s15 {
    public void reversevowel(String s)
    {
        HashSet<Character>set1=new HashSet<>();
        set1.add('a');
        set1.add('e');
        set1.add('i');
        set1.add('o');
        set1.add('u');
        set1.add('A');
        set1.add('E');
        set1.add('I');
        set1.add('O');
        set1.add('U');
        char ch1[]=s.toCharArray();
             int i=0;
             int j=s.length()-1;
             while(i<=j)
             {
                 
            if(set1.contains(ch1[i])&&set1.contains(ch1[j]))
            {
                char temp=ch1[i];
                ch1[i]=ch1[j];
                ch1[j]=temp;
                i++;
                j--;
                     
            }
            else if(!set1.contains(ch1[i]))
            {
                i++;
            }
            else
            {
                j--;
            }
             
             }
             String modisfed=new String(ch1);
             System.out.println(modisfed);
            
              
            
    }
    
}
class main122a11
{
    public static void main(String[] args) {
        s15 cfr=new s15();
        String s= "hello";
        cfr.reversevowel(s);
    }
}
