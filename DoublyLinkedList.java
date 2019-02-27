package data_structures;
class DNode
{
    DNode prev;
    int data;
    DNode next;
}
class Doubly
{
    DNode head;
    DNode tail;
    void insert(int val)
    {
        DNode n=new DNode();
        n.prev=null;
        n.next=null;
        n.data=val;
        if(head==null)
        {
            head=n;
            tail=n;
        }
        else
        {
            DNode ptr=head;
            while(ptr.next!=null)
            {
                ptr=ptr.next;
            }
            n.prev=ptr;
            ptr.next=n;
            tail=n;
        }
    }
    public void display()
    {
        DNode ptr=head;
        while(ptr!=null)
        {
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
        System.out.println();
    }
    public void reverse()
    {
        DNode ptr=tail;
        while(tail!=null)
        {
            System.out.print(tail.data+" ");
            tail=tail.prev;
        }
        System.out.println();
    }
    public void delete(int val)
    {
        DNode ptr=head;
        if(ptr.next==null)
        {
            head=null;
        }
        else
        {
            while(ptr.data!=val)
            {
                ptr=ptr.next;
            }
            ptr.next.prev=ptr.prev;
            ptr.prev.next=ptr.next;
        }
    }
    public void insertFront(int val)
    {
        DNode n=new DNode();
        n.data=val;
        n.prev=null;
        n.next=null;
        if(head==null)
        {
            head=n;
            tail=n;
        }
        else
        {
            head.prev=n;
            n.next=head;
            head=n;
        }
    }
}
public class DoublyLinkedList {
    public static void main(String[] args) {

        Doubly m = new Doubly();
        m.insert(1);
        m.insert(2);
        m.insert(3);
        m.insert(4);
        m.insertFront(0);
        m.display();
        m.delete(2);
        m.display();
        m.reverse();
    }
}
