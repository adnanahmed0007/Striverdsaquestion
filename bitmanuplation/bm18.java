package bitmanuplation;

public class bm18 {

    public void didv(String s)
    {
        if(s.length()<3)
        {
           int h=Integer.parseInt(s);
           if(h%8==0)
           {

           } 
        }
        else{
        int sum=0;
        int digit=0;
        for(int i=s.length()-3;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int h=Integer.parseInt(String.valueOf(ch));
         digit=digit*10+h;
            System.out.println(sum);

        }
        System.out.println(digit);
        
        }

    }
}
class main09122
{
    public static void main(String[] args) {
        bm18 gtrw=new bm18();
        System.out.println();
        String s="1611";
        gtrw.didv(s);
    }
}