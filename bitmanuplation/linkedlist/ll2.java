package bitmanuplation.linkedlist;

public class ll2 {
    int length;
    Node head;
    Node tail;
    class Node{
        int value;
        Node next;
        Node(int value)
        {
            this.value=value;
            
        }
    }
    public void addNode(int value)
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
    public void deLETE(int value)
    {
        if(length==1)
        {
            head=null;
            tail=null;
        }
        Node temp=head;
        Node prev=temp;
        while(temp!=null)
        {
            if(temp.value==value)
            {
                prev.next=temp.next;
                prev=temp;
                temp=temp.next;
                 
            }
            else{
            prev=temp;
            temp=temp.next;
            }
             
        }

    }
}
class main0801ss
{
    public static void main(String[] args) {
        ll2 hyr=new ll2();
        hyr.addNode(1);
        hyr.addNode(2);
        hyr.addNode(3);
        hyr.addNode(8);
        hyr.addNode(6);
        hyr.deLETE(6);
        hyr.print();

    }
}