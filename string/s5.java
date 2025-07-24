package string;

public class s5 {
    public void dibdi(String num)
    {
        int j=num.length()-1;
        while(j>=0)
        {
            char ch=num.charAt(j); 
            int digit=Character.getNumericValue(ch);
           
            if(digit%2!=0)
            {
                String h=num.substring(0,j+1);
               System.out.println(h);
            }
           
            j--;
        }

    }
    
}
class maingss1
{
    public static void main(String[] args) {
        s5 gte=new s5();
      String s1="239537672423884969653287101";
      gte.dibdi(s1);
    }
}
