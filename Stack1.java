import java.util.Scanner;
import java.util.Arrays;
class Stack
{
	int top=0;
	//Scanner Sc = new Scanner(System.in);
	//int size=Sc.nextInt();
	int arr[] =new int[5];
	
	
	public void push(int val)
	{
		if(top==arr.length)
		{
			System.out.print("overflow");
		}
		else
		{
			arr[top++]=val;
			System.out.println("Inserted value is "+ arr[top-1]);
			
		}
	}
	public void pop()
	{
		if(top==0)
		{
			System.out.println("underflow");
		}
		else
		{
			top=top-1;
			System.out.println("Deleted  value is "+arr[top] );
		}
	}
	public void all()
	{
		for(int i=0;i<top;i++)
		{
			//System.out.println(" All");
			System.out.println("Total elements are "+arr[i]);
		}
	}
	public void peak()
	{
		System.out.println("Peak element is "+arr[top-1]);
	}
	public static void main(String [] args)
	{
		Stack st = new Stack();
		st.push(10);
		st.push(20);
		st.pop();
		st.push(30);
		st.all();
		st.peak();
	}
}