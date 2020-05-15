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

class StackArrays 
{
	static final int MAX = 1000;
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
    // return if is empty
    boolean isEmpty() 
    { 
        return (top < 0); 
    } 
    StackArrays() 
    { 
        top = -1; 
    } 
    //create add method
    boolean push(int x) 
    { 
        if (top >= (MAX - 1)) { 
            System.out.println("Stack Overflow"); 
            return false; 
        } 
        else { 
            a[++top] = x; 
            System.out.println(x + " pushed into stack"); 
            return true; 
        } 
    } 
    //create pop method for deletation
    int pop() 
    { 
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        else { 
            int x = a[top--]; 
            return x; 
        } 
    } 
    //to check top item
    int peek() 
    { 
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        else { 
            int x = a[top]; 
            return x; 
        } 
    } 
} 
  
// Driver code 
public class StackArray { 
    public static void main(String args[]) 
    { 
        StackArrays s = new StackArrays(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.peek() + " Peek"); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
