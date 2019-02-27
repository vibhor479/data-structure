package data_structures;
class Node
{
    int data;
    Node next;
}
class MyLinkedList
{
    Node head;
    public void insert(int data)
    {
        Node node=new Node();
        node.data=data;
        node.next=null;
        if(head==null)
        {
            head=node;
        }
        else
        {
            Node ptr=head;
            while(ptr.next!=null)
            {
                ptr=ptr.next;
            }
            ptr.next=node;
        }
    }
    public void insertAt(int val,int pos)
    {
        Node n=new Node();
        Node prev=new Node();
        n.data=val;
        n.next=null;
        int i=0;
        Node ptr=head;
        while(i<pos)
        {
            prev=ptr;
            ptr=ptr.next;
            i++;
        }
        prev.next=n;
        n.next=ptr;
    }
    public void deleteAt(int index)
    {
        int i=0;
        Node ptr=head;
        Node prev=new Node();
        if(ptr==null)
        {
            System.out.println("List Empty");
        }
        else
        {
            while(i<index&&ptr.next!=null)
            {
                prev=ptr;
                ptr=ptr.next;
                i++;
            }
            prev.next=ptr.next;
        }
    }
    public void display()
    {
        Node ptr=head;
        while(ptr!=null)
        {
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
    }
}
public class LinkedListDemo {
    public static void main(String[] args) {
        MyLinkedList m=new MyLinkedList();
        m.insert(1);
        m.insert(3);
        m.insert(4);
        m.insert(5);
        m.insertAt(2,1);
        m.insertAt(6,5);
        m.deleteAt(2);
        m.display();
    }
}
