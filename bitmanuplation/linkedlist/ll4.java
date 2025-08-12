package bitmanuplation.linkedlist;

import java.util.ArrayList;
import java.util.Collections;

public class ll4 {
    Node head;
    Node tail;
    int length;
    class Node
    {
        Node next;
        int value;
        Node(int value)
        {
            this.value=value;
        }
    }
    public void add(int value)
    {
         Node temp=head;
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
    public void reverse()
    {
        ArrayList<Integer>list1=new ArrayList<>();
        Node temp=head;
        while(temp!=null)
        {
            list1.add(temp.value);
            temp=temp.next;
        }
        Collections.reverse(list1);
        Node head1=null;
        Node tail1=null;
        int length=0;
        for(int value:list1)
        {
            Node newNode =new Node(value);
            if(head1==null)
            {
                head1=newNode;
                tail1=newNode;
                length++;
                
            }
            else{
                tail1.next=newNode;
                tail1=newNode;
                length++;
            }
            
        }

          Node temp1=head1;
          while(temp1!=null)
          {
            System.out.println(temp1.value);
            temp1=temp1.next;
          }
    }
    
}
class main20hdd
{
    public static void main(String[] args) {
        ll4 fre=new ll4();
        fre.add(1);
        fre.add(9);
        fre.add(10);
        fre.println();
        fre.reverse();
    }
}