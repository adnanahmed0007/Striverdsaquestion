package string;

public class s4 {
    public void sliphs(String num)
    {
        int i=0;
        int j=num.length();
        while(i<j)
        {
           String s=num.substring(i, j);
           int number=Integer.parseInt(s);
           if(number%2!=0)
           {
            System.out.println(number);

           }
            
           j--;
        }

    }
    
}
class main08222
{
    public static void main(String[] args) {
        s4 gtr=new s4();
      String s="1013389";
      gtr.sliphs(s);
    }
}