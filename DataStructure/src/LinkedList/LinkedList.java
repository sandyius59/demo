/**********************************************************************
* @Execution : default node : cmd> LinkedList.java
* 
* 
* @Purpose : dataStructure
* 
* @description :
* 
* 
* @overview :  
* @author : Sandeep kumar maurya  <sandeepkumarraj58@gmail.com>
* @version : 1.0
* @since : 28/03/2020
*
***********************************************************************/
package LinkedList;
import java.util.*;
public class LinkedList 
{
	Node head;
	class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public void puch(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next=head;
		head=new_node;
	}
	public void insertAfter(Node prev_node,int new_data)
	{
		if(prev_node==null)
		{
			System.out.println("the given previous node can not be null");
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next= prev_node.next;
		prev_node.next= new_node;
	}
	public void append(int new_data)
	{
		Node new_node = new Node(new_data);
		if(head==null)
		{
			head = new Node(new_data);
			return;
		}
		Node last= head;
		while(last.next !=null)
			last.next=new_node;
		last.next=new_node;
		return;
	}
	public void deleteNode(int position)
	{
		if(head==null)
		{
			System.out.println("list is empty");
			return;
		}
		Node temp = head;
		
		if(position==0)
		{
			head= temp.next;
			return;
		}
		for(int i=0;temp!=null && i<position-1;i++)
		{
			temp =temp.next;
		}
		if(temp==null || temp.next==null)
		{
			return;
		}
		Node next = temp.next.next;
		temp.next = next;
	}
	public int getCount()
	{
		Node temp = head;
		int count=0;
		while(temp !=null)
		{
			count++;
			temp = temp.next;
		}
		return count;
	}
	public boolean search(Node head,int x)
	{
		if(head==null)
		{
			//System.out.println("list is empty");
			return false;
		}
		if(head.data==x)
		{
			return true;
		}
		return search(head.next,x);
	}
	public void printList()
	{
		if(head==null)
		{
			System.out.println("list is empty");
		}
		Node tnode= head;
		while(tnode!=null)
		{
			System.out.print(tnode.data+" ");
			tnode=tnode.next;
		}
		
	}
	public static void main(String[] args) 
	{
		LinkedList  llist= new LinkedList ();
		Scanner scan=new Scanner(System.in);
		boolean flag = true;
		while(flag)
		{
			System.out.println("");
			System.out.println("1. Add element to the list at start");
			System.out.println("2. Add element to the list at position");
			System.out.println("3. Add element to the list at last");
			System.out.println("4. Delete element at position ");
			System.out.println("5. ViewList");
			System.out.println("6. Count of node");
			System.out.println("7. Search node");
			System.out.println("8. Exit");
			System.out.println("Enter yout choice");
			
			int choice=scan.nextInt();
			int val;
			switch(choice)
			{
			case 1:
				System.out.println("Enter the value of element");
				val= scan.nextInt();
				llist.puch(val);
				break;
			case 2:
				System.out.println("Enter the value of element");
				val=scan.nextInt();
				llist.insertAfter(llist.head.next, val);
				break;
			case 3:
				System.out.println("Enter the value of element");
				val=scan.nextInt();
				llist.append(val);
				break;
			case 4:
				System.out.println("Enter the position as u want delete node");
				val=scan.nextInt();
				llist.deleteNode(val);
				break;
			case 5:
				llist.printList();
				break;
			case 6:
				System.out.println("the count of node :"+llist.getCount());
				break;
			case 7:
				System.out.println("Enter the element as u wanr seach");
				val =scan.nextInt();
				if(llist.search(llist.head, val))
					{
						System.out.println("yes, element is exist in the list");
					}
				else
				{
					System.out.println("No, element is not exist in the list");
				}
				break;
			case 8:
				flag= false;
				break;
			default:
				System.out.println("invalid choice");
			}
		}
		scan.close();
	}

}

