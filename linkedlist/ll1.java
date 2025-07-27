package linkedlist;

public class ll1 {
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
    public void addhaed(int value)
    {
        Node Newnode=new Node(value);
        if(head==null)
        {
            head=Newnode;
            tail=Newnode;
            length++;
        }
        Newnode.next=head;
        head=Newnode;
        length++;
    }
    public void addtail(int value)
    {
        Node neWNode=new Node(value);
         tail.next=neWNode;
         tail=neWNode;
    }
    public void println()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.value+" "+length);
            temp=temp.next;
        }


    }
}
class main98node
{
    public static void main(String[] args) {
        ll1 nyt=new ll1();
        nyt.addNode(8);  
        nyt.addNode(9);
        nyt.addNode(0);
        nyt.addhaed(7);
        nyt.addtail(6);
        nyt.println();

        
    }
}
