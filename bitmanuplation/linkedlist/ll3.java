package bitmanuplation.linkedlist;

public class ll3 {
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
    public void lengthdelte()
    {
        Node temp=head;
        int lengh1=0;
        while(temp!=null)
        {
            lengh1++;
            temp=temp.next;

        }
        int mid=lengh1/2;
         mid=mid+0;
        
         int i=0;
         Node temp1=head;
         while(i<mid)
         {
            System.out.println(temp1.value);
           
            temp1=temp1.next;
            i++;

         }
         System.out.println(temp1.value);
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
class main0011
{
    public static void main(String[] args) {
        ll3 hyrs=new ll3();
        hyrs.addNode(1);
        hyrs.addNode(4);
        hyrs.addNode(3);
        hyrs.addNode(0);
        hyrs.addNode(6);
        hyrs.addNode(7);
    
        hyrs.lengthdelte();
    }
}
