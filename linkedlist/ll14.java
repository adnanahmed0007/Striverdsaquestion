package linkedlist;

public class ll14 {

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
            length++;
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
    public void Nodeed(int n)
    {
        Node temp=head;
        int length1=0;
        while(temp!=null)
        {
            length1++;
            temp=temp.next;
        }
        int h=length1-n;
        Node temp1=head;
        Node prev=null;
        int i=0;
        while(i<h&&temp1!=null)
        {
            prev=temp1;
            
            temp1=temp1.next;
            i++;
        }
        if(temp1.next==null)
        {
            prev.next=null;   
        }
else{
        
         temp1.value=temp1.next.value;
         temp1.next=temp1.next.next;
}

    }
}
class mainjkaqq
{
    public static void main(String[] args) {
        ll14 freww=new ll14();
        freww.add(1);
        freww.add(2);
        freww.add(3);
         
        freww.print();
        System.out.println();
        freww.Nodeed(1);
        System.out.println();
        freww.print();
    }
}
