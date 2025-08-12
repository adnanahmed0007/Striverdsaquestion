package bitmanuplation.linkedlist;

public class ll8 {
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
    public void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.value);
            temp=temp.next;
        }

    }
    public void oddeven()
    {
        Node head1=null;
        Node tail1=null;
        Node temp=head;
         
        while(temp.next!=null)
        {
            if(head1==null)
            {
                head1=temp;
                tail1=temp;
                 
            }
            else{
                temp=temp.next.next;
                 tail1.next=temp;
                 tail1=temp;  
            }
             
        }
         Node temp1=head.next;
        while (temp1 != null && temp1.next != null)
        {
            temp1=temp1.next.next;
            tail1.next=temp1;
            tail1=temp1;
        }
       
          
      
        Node temp11=head1;
        while(temp11!=null)
        {
            System.out.println(temp11.value);
            temp11=temp11.next;
        }
    }
}
class main10212
{
    public static void main(String[] args) {
        ll8 gtr=new ll8();
        gtr.add(1);
        gtr.add(2);
        gtr.add(3);
        gtr.add(4);
        gtr.add(5);
        gtr.print();
        System.out.println();
        gtr.oddeven();
    }
}