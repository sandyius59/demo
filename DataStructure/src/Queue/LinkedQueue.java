/**********************************************************************
* @Execution : default node : cmd> LinkedQueue.java
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
package Queue;
class QNode
{
	int key;
	QNode next;
	
	public QNode(int key)
	{
		this.key=key;
		this.next=null;
	}
}
class Queuess
{
	QNode front,rear;
	public Queuess()
	{
		this.front=this.rear=null;
	}
	void enqueue(int key)
	{
		QNode temp = new QNode(key);
		
		if(this.rear==null)
		{
			this.front=this.rear=temp;
			return;
		}
		this.rear.next=temp;
		this.rear=temp;
	}
	void dequeue()
	{
		if(this.front==null)
		{
			return;
		}
		//QNode temp = this.front;
		this.front=this.front.next;
		
		if(this.front==null)
		{
			this.rear=null;
		}
	}
}
public class LinkedQueue 
{
	public static void main(String []args)
	{
		Queuess q = new Queuess();
		q.enqueue(10);
		q.enqueue(20);
		q.dequeue();
		System.out.println("Queue front "+q.front.key);
		System.out.println("Queue Rear "+q.rear.key);
		//System.out.println(q.dequeue());
	}
}
