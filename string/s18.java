package string;

 

public class s18 {
    public void consyba(String s)
    {
           for(int i=0;i<s.length();i++)
           {
            char ch=s.charAt(i);
            boolean k=true;
            for(int j=0;j<s.length();j++)
            {
                char ch1=s.charAt(j);
                if(ch==ch1&&i!=j)
                {
                    k=false;
                    break;

                }
            }
            if(k==true)
            {
              System.out.println(ch+" "+i);
            }
           }


    }
    
}
class main9911
{
    public static void main(String[] args) {
        s18 gtre=new s18();
        
        String s="leetcode";
        gtre.consyba(s);
    }
}