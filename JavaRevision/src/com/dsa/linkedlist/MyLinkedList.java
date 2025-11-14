package com.dsa.linkedlist;

public class MyLinkedList 
{
	Node head;
	public Node remove(int index)
	{
		if(head==null)
		{
			// throw new IndexOutOfBoundsException();
			System.out.println("empty list");
			return head;
		}
		if(head.next==null && index>=0 || head.next!=null && index==0)
		{
			return removeFront();
		}
		Node temp=head;
		int c=0;
		while(temp.next.next!=null)
		{
			if(c==index-1)
			{
				break;
			}
			c++;
			temp=temp.next;
		}
		temp.next=temp.next.next;
		return head;

	}
	public Node removeFront()//T-->O(1),S-->O(1)
	{
		if(head==null)
		{
			System.out.println("empty list");
			return null;
		}
		head=head.next;
		return head;
	}
	public Node remove()//T-->O(n),S-->O(1)
	{
		if(head==null)
		{
			System.out.println("empty List");
			return null;
		}
		if(head.next==null)
		{
			return head=null;
		}
		Node temp=head;
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		temp.next=null;
		return head;
	}

	public int linearSearch(int key)
	{
		Node temp=head;
		int c=0;
		while(temp!=null)
		{        
			if(temp.data==key)
			{
				return c;
			}
			c++;
			temp=temp.next;
		}
		return -1;
	}

	public Node add(int index,int data)
	{
		if(head==null && index!=0)
		{
			System.out.println("empty");
			return head;
		}
		if(index==0)
		{
			return addFront(data);
		}

		Node vipul=new Node(data);
		int c=0;
		Node temp=head;
		//	        while(c<index-1)
		//	        {
		//	            temp=temp.next;
		//	            c++;
		//	        }
		while(temp.next!=null)
		{
			if(c>=index-1)
			{
				break;
			}
			c++;
			temp=temp.next;
		}
		vipul.next=temp.next;
		temp.next=vipul;
		return head;

	}
	public Node addFront(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
			return head;
		}
		newNode.next=head;
		head=newNode;
		return head;
	}
	public Node add(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
			return head;
		}
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=newNode;
		return head;
	}
	public boolean isIdentical (Node head1, Node head2){
		if(size(head1)!=size(head2))
		{
			return false;
		}
		Node temp1=head1;
		Node temp2=head2;
		while(temp1!=null)
		{
			if(temp1.data!=temp2.data)
			{
				return false;
			}
			temp1=temp1.next;
			temp2=temp2.next;
		}
		return true;
	}
	 public int size(Node head)
	    {
	        int c=0;
	        Node temp=head;
	        while(temp!=null)
	        {
	            c++;
	            temp=temp.next;
	        }
	        return c;
	    }


	public int size()
	{
		Node temp=head;
		int c=0;
		while(temp!=null)
		{
			c++;
			temp=temp.next;
		}
		return c;
	}
	public void display()
	{
		Node temp =head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	int getNthFromLast(Node head, int n)
	{
		Node temp=head;
		int c=0;
		while(temp!=null)
		{
			temp= temp.next;
			c++;
		}
		temp=head;
		if(n>c)
		{
			return -1;
		}
		for(int i=1;i<=(c-n);i++)
		{
			temp=temp.next;
		}
		return temp.data;
	}
	public Node selectionSort()
	{
		Node temp1=head;
		while(temp1.next!=null)
		{
			Node temp2=temp1.next;
			while(temp2!=null)
			{
				if(temp1.data<temp2.data)
				{
					int t=temp1.data;
					temp1.data=temp2.data;
					temp2.data=t;
				}
				temp2=temp2.next;
			}
			temp1=temp1.next;
		}
		return head;
	}

	// check if single linked list is circular or not(logic1)class GfG 

	boolean isCircular(Node head) 
	{
		if(head==null && head.next==null) 
		{
			return false; 
		} 
		Node front=head; 
		Node tail=head;
		while(tail!=null) 
		{ 
			tail=tail.next;
			if(front==tail) 
			{
				return true;
			}
		} 
		return false; 
	}


	// logic2
	public boolean isCircular1(Node head)
	{
		Node temp=head;
		while(temp!=null)
		{
			if(temp.next!=null && temp.next==head)
			{
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
	
}
