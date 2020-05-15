/**********************************************************************
* @Execution : default node : cmd> Queues.java
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
import java.util.LinkedList; 
import java.util.Queue;   
public class Queues
{ 
  public static void main(String[] args) 
  { 
    Queue<Integer> q = new LinkedList<>(); 
    for (int i=0; i<5; i++)                             
     q.add(i);  
    System.out.println("Elements of queue-"+q);          
    int removedele = q.remove(); 
    System.out.println("removed element-" + removedele); 
    System.out.println(q); 
    int head = q.peek(); 
    System.out.println("head of queue-" + head);  
    int size = q.size(); 
    System.out.println("Size of queue-" + size); 
  } 
}