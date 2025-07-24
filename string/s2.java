package string;

public class s2 {
    public void struingrever(String s1)
    {
        String[] words = s1.trim().split("\\s+");
        String newword="";
        for(int i=words.length-1;i>=0;i--)
        {
            if(i==0)
            {
                newword=newword+words[i];

            }
            else{

            
            newword=newword+words[i]+" ";
            }
            
            System.out.println(words[i]);
        }
        System.out.println(newword.trim());

    }
    
}
class main9091
{
    public static void main(String[] args) {
        s2 vr=new s2();
          String g1="the sky is blue";
          vr.struingrever(g1);

    }
}
