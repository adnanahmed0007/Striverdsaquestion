package string;

public class s9 {
    public void lasword(String s)
    {
        String s1[]=s.trim().split("\\s+");
          
        String g1=s1[s1.length-1];
        System.out.print(g1);

   
    }
    
}
class main081
{
    public static void main(String[] args) {
        s9 hytnew =new s9();
      String  s = "   fly me   to   the moon  ";
      hytnew.lasword(s);

    }
}