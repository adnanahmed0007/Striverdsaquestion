package string;

public class s3 {
    public void oddnumber(String s)
    {
        int min=Integer.MIN_VALUE;
       int rev=0;
        int h1=Integer.parseInt(s);
        if(h1%2!=0)
        {

        }
           System.out.println(h1);
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int digit=Character.getNumericValue(ch);
            if(digit%2!=0)
            {
                if(digit>min)
                {
                    min=digit;
                    rev=rev*10+digit;
                    System.out.println(rev);

                }

            }
        }
        if(min==Integer.MIN_VALUE)
        {
             
        }
        
       
         

    }
    
}
class main9892
{
    public static void main(String[] args) {
        s3 fr=new s3();
        String s1="10133890";
        fr.oddnumber(s1);
    }
}
