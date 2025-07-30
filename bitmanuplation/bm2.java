package bitmanuplation;

public class bm2 {
    public void maina(String s)
    {
        StringBuilder sb=new StringBuilder(s);
     String s1=sb.reverse().toString();
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
 class main011
 {
    public static void main(String[] args) {
        bm2 fre=new bm2();
        String s="1101";
        fre.maina(s);

    }
 }
