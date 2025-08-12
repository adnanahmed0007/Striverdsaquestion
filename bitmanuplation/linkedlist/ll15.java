package bitmanuplation.linkedlist;

public class ll15 {
    Node head;
    Node tail;
   int length;
   class Node{
    Node next;
    int value;
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
        length++;
    }
    else{
        tail.next=newNode;
        tail=newNode;
        length++;
    }
   }
   public void oddeven()
   {
     Node temp=head;
      
     Node head1=null;
     Node tail1=null;
     while(temp!=null)
     {
        if(head1==null)
        {
            head1=temp;
            tail1=temp;
        }
        else{
            tail1.next=temp;
            tail1=temp;
        }
           if(temp.next!=null)
           {
             temp=temp.next.next;

           }
        else{
            break;
        }
     }
     tail1.next=null;
     Node temp2=head.next;
     Node head2=null;
     Node tail2=null;
     while(temp2!=null)
     {
        if(head2==null)
        {
            head2=temp2;
            tail2=temp2;
        }
        else{
            tail2.next=temp2;
            tail2=temp2;
        }
        if(temp2.next!=null)
        {
            temp2=temp2.next.next;
        }
        else{
            break;
        }

     }
      tail2.next=null;
      Node prin=head2;
      while(prin!=null)
      {
        System.out.println(prin.value);
        prin=prin.next;
      }
     

       
     
     
     
   }
    public void println()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
}
class mainjsw
{
public static void main(String[] args) {
    ll15 frww=new ll15();
    frww.add(1);
    frww.add(2);
    frww.add(3);
    frww.add(4);
    frww.add(5);
    frww.add(6);
    frww.add(7);
   

    frww.println();
    System.out.println();
    frww.oddeven();
}
}