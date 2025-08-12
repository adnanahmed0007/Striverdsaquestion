package bitmanuplation.linkedlist;

public class ll12 {
    Node head;
    Node tail;
    int length;
    class Node{
        int value;
        Node next;
          Node( int value)
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
    public void reverse()
    {
        Node temp=head;
        Node prev=null;
        Node fornt=null;
        while(temp!=null)
        {
            fornt=temp.next;
            temp.next=prev;
            prev=temp;
            temp=fornt; 
        }
        tail=head;
        head=prev;

        

    }
}
class hiamain00
{
    public static void main(String[] args) {
        ll12 freww=new ll12();
        freww.add(1);
        freww.add(2);
        freww.add(3);
        freww.print();
        
        freww.reverse();
        
        freww.print();

    }
}