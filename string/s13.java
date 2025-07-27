package string;

 
import java.util.HashSet;

public class s13 {
    public void sustring(String s)
    {
     
       int i=0;
       int j=i+1;
       int count=1;
         
       while(i<s.length()&&j<s.length())
       {
         HashSet<Character>set1=new HashSet<>();
       
        char ch=s.charAt(i);
        char ch2=s.charAt(j);
        set1.add(ch);
        if(!set1.contains(ch2))
        {
            set1.add(ch2);
            j++;
            count++;
       }
       else{
        System.out.println(set1);
        break;
         
       }
    }
    }
}
class main081221{
    public static void main(String[] args) {
        s13 gtrwa1a=new s13();
      String  s = "abcabcbb";
      gtrwa1a.sustring(s);

    }
}