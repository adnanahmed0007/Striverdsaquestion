package recursion;

public class rc6 {
    public void sbs(String str)
    {
StringBuilder sb=new StringBuilder();
for(int i=0;i<str.length();i++)
{
    char ch=str.charAt(i);
    sb.append(ch);
    

}
 
    }
    
}
class main99112
{
    public static void main(String[] args) {
        rc6 fre=new rc6();
        String str="(+)";
        fre.sbs(str);
    }
}