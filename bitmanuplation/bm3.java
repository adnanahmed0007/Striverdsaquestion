package bitmanuplation;

public class bm3 {
    public void oneso(int n)
    { 
        StringBuilder sb=new StringBuilder();
        while(n>=1)
        {
            if(n%2==0)
            {
                sb.append(0);
            }
            else{
                sb.append(1);
            }
            n=n/2;
        }
       String s= sb.reverse().toString();
       System.out.println(s);
     
       String s1="";
      for(int i=0;i<s.length();i++)
      {
  char ch=s.charAt(i);
  if(ch=='1')
  {
    s1=s1+'0';
  }
  else{
    s1=s1+'1';
  }
      }
      System.out.println(s1);
      

        


    }
}
class main0912123{
    public static void main(String[] args) {
        bm3 gtrw1=new bm3();
        int n=131;
        gtrw1.oneso(n);
    }
}