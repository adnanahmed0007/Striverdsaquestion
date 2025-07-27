package linkedlist;

import java.util.ArrayList;

public class ll5 {
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
    public void addlinked(int value)
    {
        int length=0;
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
    public void palindroime()
    {
        ArrayList<Integer>list1=new ArrayList<>();
        Node temp=head;
        while(temp!=null)
        {
            list1.add(temp.value);
            temp=temp.next;

        }
        System.out.println(list1);
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
class main92d
{
    public static void main(String[] args) {
        ll5 fe=new ll5();
        fe.addlinked(1);
        fe.addlinked(0);
        fe.println();
        fe.palindroime();

        
    }
}