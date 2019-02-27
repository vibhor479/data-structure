import java.util.Arrays;
class Node {
    Node prev;
    char data;
    Node next;
}
class Palindrome {
    Node head;
    Node tail;
    public void insert(char val) {
        Node n = new Node();
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
        Node ptr = head;
        do {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        } while (ptr != head);
        System.out.println();
    }
    public int getLength(Node ptr)
    {
        int count=1;
        if(ptr==null)
            return 0;
        while(ptr.next!=head)
        {
            ptr=ptr.next;
            count++;
        }
        return count;
    }
    public void checkForPalindrome()
    {
        int len=getLength(head);
        if(len==0)
        {
            System.out.println("Palindrome");
            return;
        }
        char[] arr1=new char[len];
        char[] arr2=new char[len];
        int i=0;
        Node ptr1=head,ptr2=tail;
        do
        {
            arr1[i]=ptr1.data;
            arr2[i]=ptr2.data;
            ptr1=ptr1.next;
            ptr2=ptr2.prev;
            i++;
        }while(ptr1!=head&&ptr2!=tail);
        boolean result= Arrays.equals(arr1,arr2);
        if(result)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

    }
}
public class CircularLinkedListPalindrome {
    public static void main(String[] args) {
        Palindrome m = new Palindrome();
        m.insert('l');
        m.insert('0');
        m.insert('l');
        m.checkForPalindrome();

    }

}
