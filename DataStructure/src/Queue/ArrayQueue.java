/**********************************************************************
* @Execution : default node : cmd> ArrayQueue.java
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
class Queue
{
	int front, rear,size;
	int capacity;
	int array[];
	public Queue(int capacity)
	{
		this.capacity=capacity;
		front=this.size=0;
		rear=capacity-1;
		array =new int [this.capacity];
	}
	
	boolean isFull(Queue queue)
	{
		return (queue.size==queue.capacity);
	}
	boolean isEmpty(Queue queue)
	{
		return (queue.size==0);
	}
	void enqueue(int item)
	{
		if(isFull(this))
			return;
		this.rear=(this.rear+1)%this.capacity;
		this.array[this.rear]=item;
		this.size=this.size+1;
		System.out.println(item+"enqueue to queue");
	}
	int dequeue()
	{
		if(isEmpty(this))
			return Integer.MIN_VALUE;
		int item =this.array[this.front];
		this.front=(this.front+1)%this.capacity;
		this.size=this.size-1;
		return item;
	}
	int front()
	{
		if(isEmpty(this))
			return Integer.MIN_VALUE;
		return this.array[this.front];
	}
	int rear()
	{
		if(isEmpty(this))
			return Integer.MIN_VALUE;
		return this.array[this.rear];
	}
}

public class ArrayQueue 
{
	public static void main(String []args)
	{
		Queue queue = new Queue(1000);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		
		System.out.println(queue.dequeue()+"dequeue form queue");
		System.out.println("front item is "+queue.front());
		System.out.println("Rear item is "+queue.rear());
	}
}
