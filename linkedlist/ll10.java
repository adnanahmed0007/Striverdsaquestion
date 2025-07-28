package linkedlist;

public class ll10 {
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
    public void println()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
    public void findmiddle()
    { 
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null)
        {
             
            slow=slow.next;
            fast=fast.next.next;
        }
        if(slow.next==null)
        {
            
        }
        slow.value=slow.next.value;
        slow.next=slow.next.next;
          
         

        
         
    }
    
}
class main01d
{
    public static void main(String[] args) {
        ll10 gtr=new ll10();
        gtr.addNode(1);
        gtr.addNode(2);
        
        gtr.println();
        System.out.println();
        gtr.findmiddle();
        System.out.println();
        gtr.println();
    }
}