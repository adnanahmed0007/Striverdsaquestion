package string;

public class s1 {
    public void reverse(String s)
    {
         
        
             String words[]=s.split(" ");
             String s1="";
             for(String word:words)
             {
                   String newword="";
                    for(int i=word.length()-1;i>=0;i--)
                    {
                        char ch=word.charAt(i);
                         
                        newword+=ch;

                    }
                  s1=s1+newword+" ";
                  
                   
                
             }
              System.out.println(s1);
            
        

    }
    
}
class main08112
{
    public static void main(String[] args) {
        s1 ht=new s1();
        String g1="the sky is blue";
        ht.reverse(g1);
    }
}
