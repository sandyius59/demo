
/**********************************************************************
* @Execution : default node : cmd> DequeExample.java
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
***********************************************************************/package Deque;
import java.util.*;
public class DequeExample 
{
	public static void main (String []argd)
	{
		Deque<String> deque =new LinkedList<String>();
		deque.add("Element 1 (tail)");
		deque.addFirst("Element 2 (head)");
		deque.addLast("Element 3 (tail)");
		deque.push("Element 4 (head)");
		deque.offer("Elemnet 5 (tail)");
		deque.offerFirst("Element 6 (head)");
		deque.offerLast("Element 7 (tail)");
		System.out.println(deque+"\n");
		System.out.println("peek"+deque.peek());
		System.out.println("pop"+deque.pop());
		System.out.println("contain element 3 :"+deque.contains("Element 3(tail)"));
		deque.removeFirst();
		deque.removeLast();
		System.out.println("Deque afer removing "+"first and last :"+deque);
	}
}
