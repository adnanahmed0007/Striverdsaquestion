package linkedlist;

public class ll13 {
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
    public void revsre()
    {
        Node fron=null;
        Node prev=null;
        Node temp=head;
        while(temp!=null)
        {
            fron=temp.next;
            temp.next=prev;
            prev=temp;
            temp=fron;
        }
        tail=head;
        head=prev;



    }
}
class main0912
{
    public static void main(String[] args) {
        ll13 drw=new ll13();
        drw.add(1);
        drw.add(2);
        drw.add(3);
        drw.print();
        System.out.println();
        drw.revsre();
        drw.print();
    }
}