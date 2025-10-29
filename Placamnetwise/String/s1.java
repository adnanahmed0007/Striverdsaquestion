package Placamnetwise.String;

 

public class s1 {
    public void nijss(String s)
    {
        int i=1;
        int j=i-1;
        String s1="";
        int count=1;
        while(i<s.length())
        {
            char ch=s.charAt(i);
            char ch1=s.charAt(j);
            if(ch==ch1)
            { 
                count++;
                 
            }
            else{
                s1=s1+ch1;
                s1=s1+count;
                count=1;
            }
             
            i++;
            j++;
        }
        s1=s1+s.charAt(s.length()-1)+count;
         
System.out.println(s1);
    }
    
}
class main091s
{
    public static void main(String[] args) {
        s1 hgt=new s1();
        String s="aabbccc";
        hgt.nijss(s);
    }
}