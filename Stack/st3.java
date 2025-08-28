package Stack;

public class st3 {
      int top=-1;
    int srack[]=new int[10];
    public void push(int x)
    {
        
     
    if(top<=10)
    {
        top=top+1;
        srack[top]=x;
        System.out.println( srack[top]);
    }
    
}
public void top()
{
    if(top==-1)
    {

    }
    System.out.println(srack[top]);
}
    
}
class main0912221111{
    public static void main(String[] args) {
        st3 reww1=new st3();
        int x=1;
        reww1.push(x);
        reww1.push(2);
        reww1.push(3);
        reww1.top();
    }
}
