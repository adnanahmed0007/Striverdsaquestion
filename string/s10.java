package string;

public class s10 {
      public void strStr(String haystack, String needle) 
      { 
        for(int i=0;i<=haystack.length()-needle.length();i++)
        {
            String s1=haystack.substring(i, i+needle.length());
            if(s1.equals(needle))
            {
                System.out.println(s1+" "+needle+" "+i);
            }
            System.out.println(s1);
        }
     
      }
    
}
class main1001
{
    public static void main(String[] args) {
        s10 hyt=new s10();
       String haystack = "hello";
       String needle = "ll";
       hyt.strStr(haystack, needle);
    }
}