package linkedlist;

public class ll9 {
    Node head;
    Node tail;
    int length;
    class Node{
        int value;
        Node next;
        Node(int value)
        {
            this.value=value;
        }
    }
    public void add(int value)
    {
        Node newNode=new Node(value);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
            length++;
            
        
        }
    }
public void printa(int n)
{
    Node temp=head;
    int length1=0;
    while(temp!=null)
    {
        length1++;
        temp=temp.next;
    }
    int h=length1-n;
  
    int i=0;
    Node temp1=head;
    Node head1=null;
    Node tail1=null;
    while(temp1!=null)
    {
        int c=h;
        if(head1==null)
        {
            head1=temp1;
            tail1=temp1;
        }
        else if(i==c-1){
            
            tail1=temp1.next;
            tail1=temp1;
           
        }
        else
        {
            tail1.next=temp1;
            tail1=temp1;
        }
        System.out.println(temp1.value);
        i++;
        temp1=temp1.next;
    }

     


     
     

}
    public void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
}
class main0801ss1{
    public static void main(String[] args) {
        ll9 htr=new ll9();
        System.out.println();
        htr.add(1);
        htr.add(2);
        htr.add(3);
        htr.add(4);
        htr.add(5);
        htr.print();
        System.out.println();
        htr.printa(2);

    }
}
