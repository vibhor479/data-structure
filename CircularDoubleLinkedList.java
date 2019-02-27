package data_structures;

class CircularDoubly {
    DNode head;
    DNode tail;

    void insert(int val) {
        DNode n = new DNode();
        n.prev = null;
        n.next = null;
        n.data = val;
        if (head == null) {
            head = n;
            tail = n;
            head.prev = tail;
            tail.next = head;
        } else {
            n.prev = tail;
            tail.next = n;
            tail = n;
            tail.next = head;
            head.prev = tail;
        }
    }
    public void display() {
        DNode ptr = head;
        int i = 8;
        do {
            System.out.print(ptr.data + " ");
            i--;
            ptr = ptr.next;
        } while (ptr != head || i != 0);
        System.out.println();
    }

    public void reverse() {
        DNode ptr = tail;
        while (tail != null) {
            System.out.print(tail.data + " ");
            tail = tail.prev;
        }
        System.out.println();
    }

    public void delete(int val) {
        DNode ptr = head;
        if (ptr.next == null) {
            head = null;
        } else {
            while (ptr.data != val) {
                ptr = ptr.next;
            }
            ptr.next.prev = ptr.prev;
            ptr.prev.next = ptr.next;
        }
    }

    public void insertFront(int val) {
        DNode n = new DNode();
        n.data = val;
        n.prev = null;
        n.next = null;
        if (head == null) {
            n.prev = n;
            n.next = n;
            head = n;
            tail = n;
        } else {
            head.prev = n;
            n.next = head;
            head = n;
            head.prev = tail;
            tail.next = head;
        }
    }
    public void request() {
        head = head.next.next;
        DNode ptr = head;
        do {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        } while (ptr != head);

    }
    public void deleteBeg()
    {
        if(head==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            if(head==tail)
            {
                head=null;
                tail=null;
            }
            else
            {
                head=head.next;
                head.prev=tail;
                tail.next=head;
            }
        }
    }
}
public class CircularDoubleLinkedList {
    public static void main(String[] args) {
        CircularDoubly m = new CircularDoubly();
        m.insert(40);
        m.insert(30);
        m.insert(20);
        m.insert(10);
        m.display();
        m.request();
    }
}
