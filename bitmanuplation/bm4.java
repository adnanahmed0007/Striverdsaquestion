package bitmanuplation;

public class bm4 {
    public void replace(int N,int K)
    {
StringBuilder sb=new StringBuilder();
while(N>=1)
{
    if(N%2==0)
    {
        sb.append(0);
    }
    else{
        sb.append(1);
    }
    N=N/2;
}
sb=sb.reverse();
 String s=sb.toString();
 
 String s11="";
  for(int i=0;i<s.length();i++)
  {
     char ch=s.charAt(i);
    if(i==K-1)
    {
        
        if(ch=='1')
        {
            s11=s11+'0';
        }
        else{
            s11=s11+'1';
        }

    }
    else{
        s11=s11+ch;
    }
  }
  StringBuilder sb1=new StringBuilder(s11);
     String s1=sb1.reverse().toString();
     int add=0;
     for(int i=0;i<s1.length();i++)
     {
        char ch1=s1.charAt(i);
    int num=Integer.parseInt(String.valueOf(ch1));
   double i1=(int) i;
   double k=2;
   double h1= Math.pow(k, i1);
   int k1=(int) h1;
   add=add+k1*num;

     }
System.out.println(add);
        
 
   


 
    }
    
}
class main0avcs
{
    public static void main(String[] args) {
        bm4 fgtr=new bm4();
        int n=42;
        int k=2;
        fgtr.replace(n, 4);
    }
}
