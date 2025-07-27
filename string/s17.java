package string;

public class s17 {
    public void seljs(String s)
    {
        char ch[]=s.toCharArray();
        int count[]=new int[26];
         for(char ch1:ch)
         {
            count[ch1-'a']++;
         }
for(int i=0;i<count.length;i++)
{
int h=count[ch[i]-'a'];
if(h==1)
{
    System.out.println(ch[i]+" "+h);
}
}
    }
    
}
class oj0jaa{
    public static void main(String[] args) {
        s17 gtew=new s17();
        String s="leetcode";
        gtew.seljs(s);
    }
}