/**********************************************************************
* @Execution : default node : cmd> HashSetExample.java
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
package Set;
import java.util.HashSet;
public class HashSetExample 
{
	public static void main(String[] args) 
	{
		//Add element 
		HashSet<Integer> evenNumber=new HashSet<>();
		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(6);
		evenNumber.add(8);
		evenNumber.add(5);
		System.out.println("EvenNumber "+evenNumber);
		HashSet<Integer>number=new HashSet<>();
		number.addAll(evenNumber);
		number.add(5);
		System.out.println("new HashSet: "+number);
		//evenNumber.remove(2);
		
		//Remove of set
		System.out.println("Is element delete ? "+evenNumber.remove(2));
		
		HashSet<Integer> oddNumber=new HashSet<>();
		oddNumber.add(3);
		oddNumber.add(5);
		oddNumber.add(7);
		oddNumber.add(9);
		System.out.println("Odd number : "+oddNumber);
		//union of two set
		//oddNumber.addAll(evenNumber);
		//System.out.println("Union Set"+oddNumber);
		
		//Intersection of two sets
//		oddNumber.retainAll(evenNumber);
//		System.out.println("Intersection : "+oddNumber);
		
		//difference between two set
		oddNumber.removeAll(evenNumber);
		System.out.println("difference : "+oddNumber);
		
		// check if number is a subset of set 
		boolean result =evenNumber.containsAll(oddNumber);
		System.out.println("Is Hashset is subset of HashSet ?"+result);
		
	}
}
