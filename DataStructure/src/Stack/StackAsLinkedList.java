/**********************************************************************
* @Execution : default node : cmd> StackArray.java
* 
* 
* @Purpose : to store data as last in first out
* 
* @description :A stack is a container of objects that are inserted and 
* removed according to the last-in first-out (LIFO) principle
* 
* @overview :  
* @author : Sandeep kumar maurya  <sandeepkumarraj58@gmail.com>
* @version : 1.0
* @since : 28/03/2020
*
***********************************************************************/
package Stack;
public class StackAsLinkedList 
{ 	  
    StackNode root; 
    static class StackNode 
    { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data; 
        } 
    } 
  
    public boolean isEmpty() 
    { 
        if (root == null) 
        { 
            return true; 
        } 
        else
            return false; 
    } 
    //create push method for 
    public void push(int data) 
    { 
        StackNode newNode = new StackNode(data); 
  
        if (root == null) 
        { 
            root = newNode; 
        } 
        else 
        { 
            StackNode temp = root; 
            root = newNode; 
            newNode.next = temp; 
        } 
        System.out.println(data + " pushed to stack"); 
    } 
    //create pop method for delete item
    public int pop() 
    { 
        int popped = Integer.MIN_VALUE; 
        if (root == null) 
        { 
            System.out.println("Stack is Empty"); 
        } 
        else 
        { 
            popped = root.data; 
            root = root.next; 
        } 
        return popped; 
    } 
    //create peek method for check top item
    public int peek() 
    { 
        if (root == null) 
        { 
            System.out.println("Stack is empty"); 
            return Integer.MIN_VALUE; 
        } 
        else 
        { 
            return root.data; 
        } 
    } 
    //create main method and pass value
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    }
}