package string;

import java.util.HashMap;

public class s6 {
    public void coomonisop(String s,String t)
    {
        HashMap<Character,Integer>map1=new HashMap<>();
       
        int i=0;
        int j=s.length()-1;
        while(i<=j)
        {
            char ch=s.charAt(i);
             

             if(map1.containsKey(ch))
             {
                int h=map1.get(ch);
                int og=h+1;
                map1.put(ch,og);
             }
             else{
                map1.put(ch, 1);
             }
              
             i++;
        }
         
            HashMap<Character,Integer>map2=new HashMap<>();
            int i1=0;
        int j1=t.length()-1;
        while(i1<=j1)
        {
            char ch=t.charAt(i1);
             

             if(map2.containsKey(ch))
             {
                int h=map2.get(ch);
                int og=h+1;
                map2.put(ch,og);
             }
             else{
                map2.put(ch, 1);
             }
              
             i1++;
        }
         if(map1.equals(map2))
         {
               System.out.println(map2);
               System.out.println(map1);

         }
      
 
 
    }
    
}
class main091bw
{
    public static void main(String[] args) {
        s6 gt=new s6();
       String s = "egg";
       String t = "add";
       gt.coomonisop(s, t);
    }
}