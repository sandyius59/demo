/**********************************************************************
* @Execution : default node : cmd> NavigationSetExample.java
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

import java.util.NavigableSet;
//import java.util.SortedSet;
import java.util.TreeSet;

public class NavigationSetExample 
{
	public static void main(String args[])
	{
	NavigableSet<Integer>number1=new TreeSet<>();
	number1.add(1);
	number1.add(5);
	number1.add(3);
	System.out.println("Navigation set "+number1);
	int first=number1.first();
	System.out.println("first number "+first);
	int last=number1.last();
	System.out.println("last number "+last);
	int num1 = number1.pollFirst();
	System.out.println("removed first element "+num1);
	int num2 = number1.pollLast();
	System.out.println("removed last element "+num2);
	
	}
}
