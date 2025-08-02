package bitmanuplation;

import java.util.ArrayList;
 

public class bm13 {
    public void jbhk(int n)
    {
ArrayList<Integer>list1=new ArrayList<>();
while(n>=1)
{
    if(n%2==0)
    {
        list1.add(0);
    }
    else{
        list1.add( 1);
    }
    n=n/2;
}
if (list1.size() % 2 != 0) {
            list1.add(0);
        }

 System.out.println(list1);
 
for(int i=0;i<list1.size();i=i+2)
{
    int temp=list1.get(i);
    list1.set(i,list1.get(i+1));
    list1.set(i+1,temp);

}
int add=0;
for(int i=0;i<list1.size();i++)
{
    add=add+(1<<i)*list1.get(i);
}
System.out.println(add);
System.out.println(list1);
 
  

    }
    
}
class main09122ss
{
    public static void main(String[] args) {
        bm13 fre=new bm13();
        fre.jbhk(23);
    }
}
