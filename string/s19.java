package string;

public class s19 {
    public void straingaa(String str)
    { int count=0;
           for(int i=str.length()-1;i>=0;i--)
           {
            char ch=str.charAt(i);
            
            if(ch!=' ')
            {
                count++;

            }
            else{
                break;
            }
           }
           System.out.println(count);
         
           

    }
    
}
class main01
{
    public static void main(String[] args) {
        s19 gtr=new s19();
        String s="hello world ppp   99 0 -   09000   ";
       String s1=s.trim();
        gtr.straingaa(s1);
    }
}