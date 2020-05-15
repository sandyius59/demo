/**********************************************************************
* @Execution : default node : cmd> TreeSetExample.java
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
import java.util.SortedSet;
import java.util.TreeSet;
public class SortedSetExample 
{
	public static void main(String args[])
	{
	SortedSet<Integer>number1=new TreeSet<>();
	number1.add(1);
	number1.add(5);
	number1.add(3);
	System.out.println("sorted set "+number1);
	System.out.println("sorted set "+number1.remove(3));
	
	}
}
