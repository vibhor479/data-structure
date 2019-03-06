import java.util.*;
class stackLinked
{
	class Node
	{
		int data;
		Node prev;
	}
	Node top;
	void push(int num)
	{
		Node node = new Node();
		node.data=num;
		if(top==null)
		{
			node.prev=top;
			top=node;
		}
		else
		{
			node.prev=top;
			top=node;
		}
	}
	void pop()
	{
		if(top==null)
		{
			System.out.println("underflow");
		}
		else
		{
		Node temp = top;
		System.out.println("Popped element is "+temp.data);
		top=top.prev;
		temp=null;
		}
	}
	 public void display() 
    { 
        
        if (top == null) { 
            System.out.println("Underflow"); 
        
        } 
        else { 
            Node temp = top; 
            while (temp != null) { 
   
                System.out.println("Elements are " + temp.data); 
                temp = temp.prev; 
            } 
        } 
    } 
}
class runner
{
 public static void main(String [] args)
	{
		stackLinked p=new stackLinked();
		
	    p.push(10);
		p.push(20);
		p.push(30);
		p.pop();
		p.display();
	} 
}