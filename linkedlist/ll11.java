package linkedlist;

public class ll11 {
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
    public void findmmidd()
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.value=slow.next.value;
        slow.next=slow.next.next;
        System.out.println(slow.value);
    }
}
class main091ww
{
    public static void main(String[] args) {
        ll11 gtrw=new ll11();
        gtrw.add(1);
        gtrw.add(2);
        gtrw.add(3);
        gtrw.add(4);
        gtrw.print();
        System.out.println();
        gtrw.findmmidd();
        System.out.println();
        gtrw.print();
    }
}
