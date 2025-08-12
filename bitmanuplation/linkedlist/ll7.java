package bitmanuplation.linkedlist;

import java.util.ArrayList;

public class ll7 {
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
    public void addelem(int value)
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
    public void oddeven()
    {
        ArrayList<Integer>list1=new ArrayList<>();
        Node temp=head;
        while(temp!=null)
        {
            int h=temp.value;
            if(h%2!=0)
            {
                list1.add(temp.value);
            }
            temp=temp.next;
        }
         temp=head;
        while(temp!=null)
        {
            int h=temp.value;
            if(h%2==0)
            {
                list1.add(temp.value);
            }
            temp=temp.next;
        }
        Node head1=null;
        Node tail1=null;
    
         for(int i=0;i<list1.size();i++)
         {
            int h=list1.get(i);
            Node newNode=new Node(h);
            if(head1==null)
            {
                head1=newNode;
                tail1=newNode;
            }
            else{
                tail1.next=newNode;
                tail1=newNode;
            }
         }
         Node temp12=head1;
         while(temp12!=null)
         {
            System.out.println(temp12.value);
            temp12=temp12.next;
         }
    }
}
class main011d
{
    public static void main(String[] args) {
        ll7 fh=new ll7();
        fh.addelem(1);
        fh.addelem(2);
        fh.addelem(4);
        fh.addelem(3);
        fh.println();
        System.out.println();
        System.out.println("");
        fh.oddeven();
    }
}