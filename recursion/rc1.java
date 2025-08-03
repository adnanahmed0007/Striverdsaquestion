package recursion;

public class rc1 {
     public void receursuin(int n)
     {
         if(n==0)
         {
            
            return ;
             

         }
         receursuin(n-1);
          System.out.println(n+"");

     }
    
}
class main09211
{
    public static void main(String[] args) {
        rc1 gtee=new rc1();
        gtee.receursuin(3);
    }
}
