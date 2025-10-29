package string;

public class s20 {
    public void strs(String str1)
    {
        String parts[]=str1.split(" ");
        System.out.println(parts[parts.length-1].length());

    }
    
}
class main0122as
{
    public static void main(String[] args) {
        s20 gtrw=new s20();
        String str1="hello world jd     ";
        String tri1=str1.trim();
        gtrw.strs(tri1);
    }
}